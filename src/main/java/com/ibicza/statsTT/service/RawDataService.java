package com.ibicza.statsTT.service;

import com.ibicza.statsTT.model.RawData;
import com.ibicza.statsTT.repository.RawDataRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class RawDataService {

    private final RawDataRepository rawDataRepository;
    private static final Logger logger = LoggerFactory.getLogger(RawDataService.class);

    public RawDataService(RawDataRepository rawDataRepository) {
        this.rawDataRepository = rawDataRepository;
    }

    public List<RawData> getAllData() {
        return rawDataRepository.findAll();
    }

    public void saveRawData(RawData rawData) {
        rawDataRepository.save(rawData);
    }

    @Async
    public void saveRawDataAsync(RawData rawData) {
        try {
            saveRawData(rawData);
        } catch (Exception e) {
            logger.error("Error saving raw data asynchronously: {}", e.getMessage());
        }
        CompletableFuture.completedFuture(null);
    }


    public RawData getDataById(Long id) {
        return rawDataRepository.findById(id).orElse(null);
    }
}

