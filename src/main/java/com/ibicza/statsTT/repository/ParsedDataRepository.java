package com.ibicza.statsTT.repository;

import com.ibicza.statsTT.model.ParsedData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParsedDataRepository extends JpaRepository<ParsedData, Long> {
    // Здесь можно добавить кастомные запросы, если нужно
}
