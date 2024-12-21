package com.ibicza.statsTT.controller;

import com.ibicza.statsTT.DTO.ParsedDataDTO;
import com.ibicza.statsTT.model.RawData;
import com.ibicza.statsTT.service.ParsedDataService;
import com.ibicza.statsTT.service.ParsingData;
import com.ibicza.statsTT.service.RawDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;


@RestController
@RequestMapping("/api")
public class FileUploadController {

    private final RawDataService rawDataService;
    private final ParsedDataService parsedDataService;
    private final ParsingData parsingData;

    public FileUploadController(RawDataService rawDataService, ParsedDataService parsedDataService, ParsingData parsingData) {
        this.rawDataService = rawDataService;
        this.parsedDataService = parsedDataService;
        this.parsingData = parsingData;
    }

    private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);

    @PostMapping("/upload")
    public ResponseEntity<ParsedDataDTO> handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            logger.error("Uploaded file is empty");
            return ResponseEntity.badRequest().body(null);
        }

        try {
            // Преобразуем файл в строку
            String jsonString = new String(file.getBytes(), StandardCharsets.UTF_8);

            // Сохраняем необработанные данные
            RawData rawData = new RawData();
            rawData.setJsonContent(jsonString);
            rawData.setReceivedAt(LocalDateTime.now());
            rawDataService.saveRawDataAsync(rawData);

            // Парсим JSON, преобразуем в ParsedDataDTO и сохраняем
            ParsedDataDTO parsedDataDTO = parsingData.getParsedDataDTO(parsingData.jsonStringToObject(jsonString));
            parsedDataService.saveParsedData(parsedDataDTO.toParsedData());

            logger.info("File successfully processed");
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

