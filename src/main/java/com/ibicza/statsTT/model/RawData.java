package com.ibicza.statsTT.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "raw_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RawData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String source; // Источник данных, например, "TikTok"

    @Lob
    private String jsonContent; // Исходный JSON-файл (хранится как текст)

    private LocalDateTime receivedAt; // Время получения данных
}
