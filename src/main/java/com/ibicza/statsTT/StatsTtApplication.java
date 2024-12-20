package com.ibicza.statsTT;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.ibicza.statsTT.DTO.ttjson.RootNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Files;
import java.nio.file.Path;

@SpringBootApplication
public class StatsTtApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatsTtApplication.class, args);

		try {
			String json = Files.readString(Path.of("src/user_ibicza_data_tiktok.json")); // Вставьте ваш JSON здесь
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.registerModule(new JavaTimeModule()); // Регистрация модуля для поддержки java.time

			RootNode rootNode = objectMapper.readValue(json, RootNode.class);

			// Проверьте поля
			System.out.println(rootNode.getActivity().getFavoriteEffects());
		} catch (Exception e) {
			e.printStackTrace();
		}




	}


}
