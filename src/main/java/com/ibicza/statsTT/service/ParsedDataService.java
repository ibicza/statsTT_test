package com.ibicza.statsTT.service;

import com.ibicza.statsTT.DTO.ParsedDataDTO;
import com.ibicza.statsTT.controller.FileUploadController;
import com.ibicza.statsTT.model.ParsedData;
import com.ibicza.statsTT.model.RawData;
import com.ibicza.statsTT.repository.ParsedDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class ParsedDataService {

    private final ParsedDataRepository parsedDataRepository;
    private static final Logger logger = LoggerFactory.getLogger(ParsedDataService.class);

    public ParsedDataService(ParsedDataRepository parsedDataRepository) {
        this.parsedDataRepository = parsedDataRepository;
    }

    public List<ParsedData> getAllParsedData() {
        return parsedDataRepository.findAll();
    }

    public ParsedData saveParsedData(ParsedData parsedData) {
        return parsedDataRepository.save(parsedData);
    }

    @Async
    public CompletableFuture<Void> saveParsedDataAsync(ParsedData parsedData) {
        try {
            saveParsedData(parsedData);
        } catch (Exception e) {
            logger.error("Error saving parse data asynchronously: {}", e.getMessage());
        }
        return CompletableFuture.completedFuture(null);
    }

    public ParsedData getParsedDataById(Long id) {
        return parsedDataRepository.findById(id).orElse(null);
    }

}
