package com.ibicza.statsTT.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.ibicza.statsTT.DTO.ParsedDataDTO;
import com.ibicza.statsTT.DTO.ttjson.*;



import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ParsingData {

    public static RootNode jsonStringToObject(String json) {

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule()); // Регистрация модуля для поддержки java.time

        try {
            return objectMapper.readValue(json, RootNode.class);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static ParsedDataDTO getParsedDataDTO(RootNode rootNodeObj) {

        ParsedDataDTO parsedDataDTO = new ParsedDataDTO();

        parsedDataDTO.setUsername(rootNodeObj.getProfile().getProfileInformation().getProfileMap().getUserName());
        parsedDataDTO.setCountVideosWatched(rootNodeObj.getActivity().getVideoBrowsingHistory().getVideoList().size());
        parsedDataDTO.setCountVideoLiked(rootNodeObj.getActivity().getFavoriteVideos().getFavoriteVideoList().size());
        parsedDataDTO.setCountFriendsVideosLiked(rootNodeObj.getActivity().getLikeList().getItemFavoriteList().size());
        parsedDataDTO.setCountVideoShared(rootNodeObj.getActivity().getShareHistory().getShareHistoryList().size());
        parsedDataDTO.setCountComments(rootNodeObj.getComment().getComments().getCommentsList().size());
        parsedDataDTO.setCountUsedHashtags(rootNodeObj.getActivity().getHashtag().getHashtagList().size());
        parsedDataDTO.setCountLivesWatched(rootNodeObj.getTiktokLive().getWatchLiveHistory().getWatchLiveMap().size());
        parsedDataDTO.setCountLoginHistory(rootNodeObj.getActivity().getLoginHistory().getLoginHistoryList().size());

        parsedDataDTO.setMostUsedEmojis(getTopEmojisAsString(getEmojiCountMap(rootNodeObj)));
        // Создание изменяемых коллекций
        parsedDataDTO.setUsedHashTags(new ArrayList<>(
                rootNodeObj.getActivity().getHashtag().getHashtagList().stream()
                        .map(HashtagList::getHashtagName)
                        .toList()
        ));
        parsedDataDTO.setShearList(new ArrayList<>(
                rootNodeObj.getActivity().getSearchHistory().getSearchList().stream()
                        .map(SearchList::getSearchTerm)
                        .toList()
        ));
        parsedDataDTO.setCommentsWrite(new ArrayList<>(
                rootNodeObj.getComment().getComments().getCommentsList().stream()
                        .map(CommentsList::getComment)
                        .toList()
        ));

        return parsedDataDTO;
    }

    private static String getTopEmojisAsString(Map<String, Integer> emojiCountMap) {
        StringBuilder result = new StringBuilder();

        // Сортируем и выбираем топ-5 эмодзи
        emojiCountMap.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) // Сортировка по убыванию
                .limit(5) // Берём топ-5
                .forEach(entry -> result.append(entry.getKey()).append(" (").append(entry.getValue()).append("), "));

        // Удаляем последнюю запятую и пробел
        if (result.length() > 2) {
            result.setLength(result.length() - 2);
        }

        return result.toString();
    }

    private static Map<String, Integer> getEmojiCountMap(RootNode rootNodeObj) {

        Map<String, Integer> emojiCountMap = new HashMap<>();

        // Регулярное выражение для поиска эмодзи
        String emojiRegex = "[\\p{So}\\p{Cn}]";
        Pattern emojiPattern = Pattern.compile(emojiRegex);


        // Подсчет эмодзи из комментариев
        for (CommentsList comment : rootNodeObj.getComment().getComments().getCommentsList()) {
            String text = comment.getComment();
            Matcher matcher = emojiPattern.matcher(text);
            while (matcher.find()) {
                String emoji = matcher.group();
                emojiCountMap.put(emoji, emojiCountMap.getOrDefault(emoji, 0) + 1);
            }
        }

        // Подсчет эмодзи из сообщений
        for (List<ChatHistoryWith> chatHistory : rootNodeObj.getDirectMessages().getChatHistory().getChatHistory().values()) {

            for (ChatHistoryWith chatHistoryWith : chatHistory) {
                Matcher matcher = emojiPattern.matcher(chatHistoryWith.getContent());
                while (matcher.find()) {
                    String emoji = matcher.group();
                    emojiCountMap.put(emoji, emojiCountMap.getOrDefault(emoji, 0) + 1);
                }
            }


        }

        return emojiCountMap;
    }

}

