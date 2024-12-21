package com.ibicza.statsTT.service;

import com.ibicza.statsTT.DTO.ParsedDataDTO;
import com.ibicza.statsTT.model.ParsedData;
import com.ibicza.statsTT.repository.ParsedDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParsedDataService {

    private final ParsedDataRepository parsedDataRepository;

    public ParsedDataService(ParsedDataRepository parsedDataRepository) {
        this.parsedDataRepository = parsedDataRepository;
    }

    public List<ParsedData> getAllParsedData() {
        return parsedDataRepository.findAll();
    }

    public ParsedData saveParsedData(ParsedData parsedData) {
        return parsedDataRepository.save(parsedData);
    }

    public ParsedData getParsedDataById(Long id) {
        return parsedDataRepository.findById(id).orElse(null);
    }

}
