package com.ibicza.statsTT.repository;

import com.ibicza.statsTT.model.RawData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RawDataRepository extends JpaRepository<RawData, Long> {
    // Здесь можно добавить кастомные запросы, если нужно
}

