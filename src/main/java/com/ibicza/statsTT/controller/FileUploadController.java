package com.ibicza.statsTT.controller;

import com.ibicza.statsTT.DTO.ParsedDataDTO;
import com.ibicza.statsTT.service.ParsedDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;



@RestController
@RequestMapping("/api")
public class FileUploadController {


    private final ParsedDataService parsedDataService;


    public FileUploadController(ParsedDataService parsedDataService) {
        this.parsedDataService = parsedDataService;
    }

    private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);

    @PostMapping("/upload")
    public ResponseEntity<ParsedDataDTO> handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            logger.error("Uploaded file is empty");
            return ResponseEntity.badRequest().body(null);
        }

        try {
            ParsedDataDTO parsedDataDTO = parsedDataService.processFile(file);
            return ResponseEntity.ok(parsedDataDTO);
        } catch (IOException e) {
            logger.error("Error reading uploaded file: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            logger.error("Unexpected error: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

