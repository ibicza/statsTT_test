package com.ibicza.statsTT;

import com.ibicza.statsTT.model.ParsedData;
import com.ibicza.statsTT.repository.ParsedDataRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestDataInitializer implements CommandLineRunner {

    private final ParsedDataRepository parsedDataRepository;

    public TestDataInitializer(ParsedDataRepository parsedDataRepository) {
        this.parsedDataRepository = parsedDataRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        ParsedData data = new ParsedData();
        data.setUsername("test_user");
        data.setCommentsWrite("");
        data.setCountComments(1);
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
    }
}

