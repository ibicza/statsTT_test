package com.ibicza.statsTT.service;

import com.ibicza.statsTT.model.RawData;
import com.ibicza.statsTT.repository.RawDataRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RawDataService {

    private final RawDataRepository rawDataRepository;

    public RawDataService(RawDataRepository rawDataRepository) {
        this.rawDataRepository = rawDataRepository;
    }

    public List<RawData> getAllData() {
        return rawDataRepository.findAll();
    }

    public RawData saveRawData(RawData rawData) {
        return rawDataRepository.save(rawData);
    }

    public RawData getDataById(Long id) {
        return rawDataRepository.findById(id).orElse(null);
    }
}

