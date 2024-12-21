package com.ibicza.statsTT;

import com.ibicza.statsTT.model.ParsedData;
import com.ibicza.statsTT.repository.ParsedDataRepository;
import com.ibicza.statsTT.service.ParsingData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class TestDataInitializer implements CommandLineRunner {

    private final ParsedDataRepository parsedDataRepository;

    public TestDataInitializer(ParsedDataRepository parsedDataRepository) {
        this.parsedDataRepository = parsedDataRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://postgres:5432/tiktokparse", "postgres", "admin")) {
            System.out.println("Connected to PostgreSQL!");
        } catch (SQLException e) {
            e.printStackTrace();
        }


        ParsedData data = new ParsedData();
        data.setUsername("test_user");
        data.setCommentsWrite("");
        data.setCountComments(5000);
        data.setCountFriendsVideosLiked(1);
        data.setCountLivesWatched(1);
        data.setCountUsedHashtags(1);
        data.setCountVideoLiked(1);
        data.setCountVideoShared(1);
        data.setCountVideosWatched(1);
        data.setShearList("1");
        data.setUsedHashTags("1");
        data.setCommentsWrite("tfcghj");
        data.setMostUsedEmojis("fghjkl");
        parsedDataRepository.save(data);
        System.out.println("Test data saved!");
        System.out.println("Test!" + parsedDataRepository.findById(0L));
        System.out.println("Test!" + parsedDataRepository.findById(1L));
        System.out.println("Test!" + parsedDataRepository.findById(2L));


//        System.out.println(ParsingData.getParsedDataDTO(
//                ParsingData.jsonStringToObject(Files.readString(Path.of(
//                        "/app/data/user_ibicza_data_tiktok.json")))).getCommentsWrite());



    }
}

