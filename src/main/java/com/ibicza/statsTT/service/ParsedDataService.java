package com.ibicza.statsTT.service;

import com.ibicza.statsTT.DTO.ParsedDataDTO;
import com.ibicza.statsTT.model.ParsedData;
import com.ibicza.statsTT.model.RawData;
import com.ibicza.statsTT.repository.ParsedDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class ParsedDataService {

    private final ParsedDataRepository parsedDataRepository;
    private final RawDataService rawDataService;
    private final ParsingData parsingData;
    private static final Logger logger = LoggerFactory.getLogger(ParsedDataService.class);

    public ParsedDataService(ParsedDataRepository parsedDataRepository, RawDataService rawDataService, ParsingData parsingData) {
        this.parsedDataRepository = parsedDataRepository;
        this.rawDataService = rawDataService;
        this.parsingData = parsingData;
    }

    public List<ParsedData> getAllParsedData() {
        return parsedDataRepository.findAll();
    }

    public void saveParsedData(ParsedData parsedData) {
        parsedDataRepository.save(parsedData);
    }

    @Async
    public void saveParsedDataAsync(ParsedData parsedData) {
        try {
            saveParsedData(parsedData);
        } catch (Exception e) {
            logger.error("Error saving parse data asynchronously: {}", e.getMessage());
        }
        CompletableFuture.completedFuture(null);
    }

    public ParsedData getParsedDataById(Long id) {
        return parsedDataRepository.findById(id).orElse(null);
    }

    public ParsedDataDTO processFile(MultipartFile file) throws IOException {
        // Преобразуем файл в строку
        String jsonString = new String(file.getBytes(), StandardCharsets.UTF_8);

        // Сохраняем необработанные данные асинхронно
        RawData rawData = new RawData();
        rawData.setJsonContent(jsonString);
        rawData.setReceivedAt(LocalDateTime.now());
        rawDataService.saveRawDataAsync(rawData);

        // Асинхронно парсим JSON и преобразуем в DTO

        ParsedDataDTO parsedDataDTO = parsingData.getParsedDataDTO(parsingData.jsonStringToObject(jsonString));

        // Сохраняем ParsedDataDTO
        saveParsedDataAsync(parsedDataDTO.toParsedData());

        return parsedDataDTO;
    }

}
