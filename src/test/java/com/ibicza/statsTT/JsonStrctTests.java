package com.ibicza.statsTT;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibicza.statsTT.DTO.ttjson.RootNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.file.Files;
import java.nio.file.Path;

@SpringBootTest
public class JsonStrctTests {
//    @Test
////    public void testJsonStrct() {
////        try {
////            String json = Files.readString(Path.of("C:\\Users\\artio\\OneDrive\\Рабочий стол\\user_ibicza_data_tiktok.json")); // Вставьте ваш JSON здесь
////            ObjectMapper objectMapper = new ObjectMapper();
////            RootNode rootNode = objectMapper.readValue(json, RootNode.class);
////
////            // Проверьте поля
////            System.out.println(rootNode.getActivity().getFavoriteEffects());
////            // Добавьте дополнительные проверки для других полей
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
}
