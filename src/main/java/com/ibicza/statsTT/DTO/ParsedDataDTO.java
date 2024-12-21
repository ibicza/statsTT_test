package com.ibicza.statsTT.DTO;

import com.ibicza.statsTT.model.ParsedData;
import lombok.Data;


import java.util.ArrayList;

@Data
public class ParsedDataDTO {

    private String username;

    private int countVideosWatched;
    private int countVideoLiked;
    private int countVideoShared;
    private int countFriendsVideosLiked;
    private int countComments;
    private int countUsedHashtags;
    private int countLivesWatched;
    private int countLoginHistory;

    private String mostUsedEmojis;
    private ArrayList<String> usedHashTags;
    private ArrayList<String> shearList;
    private ArrayList<String> commentsWrite;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCountVideosWatched() {
        return countVideosWatched;
    }

    public void setCountVideosWatched(int countVideosWatched) {
        this.countVideosWatched = countVideosWatched;
    }

    public int getCountVideoLiked() {
        return countVideoLiked;
    }

    public void setCountVideoLiked(int countVideoLiked) {
        this.countVideoLiked = countVideoLiked;
    }

    public int getCountVideoShared() {
        return countVideoShared;
    }

    public void setCountVideoShared(int countVideoShared) {
        this.countVideoShared = countVideoShared;
    }

    public int getCountFriendsVideosLiked() {
        return countFriendsVideosLiked;
    }

    public void setCountFriendsVideosLiked(int countFriendsVideosLiked) {
        this.countFriendsVideosLiked = countFriendsVideosLiked;
    }

    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }

    public int getCountUsedHashtags() {
        return countUsedHashtags;
    }

    public void setCountUsedHashtags(int countUsedHashtags) {
        this.countUsedHashtags = countUsedHashtags;
    }

    public int getCountLivesWatched() {
        return countLivesWatched;
    }

    public void setCountLivesWatched(int countLivesWatched) {
        this.countLivesWatched = countLivesWatched;
    }

    public int getCountLoginHistory() {
        return countLoginHistory;
    }

    public void setCountLoginHistory(int countLoginHistory) {
        this.countLoginHistory = countLoginHistory;
    }

    public String getMostUsedEmojis() {
        return mostUsedEmojis;
    }

    public void setMostUsedEmojis(String mostUsedEmojis) {
        this.mostUsedEmojis = mostUsedEmojis;
    }

    public ArrayList<String> getUsedHashTags() {
        return usedHashTags;
    }

    public void setUsedHashTags(ArrayList<String> usedHashTags) {
        this.usedHashTags = usedHashTags;
    }

    public ArrayList<String> getShearList() {
        return shearList;
    }

    public void setShearList(ArrayList<String> shearList) {
        this.shearList = shearList;
    }

    public ArrayList<String> getCommentsWrite() {
        return commentsWrite;
    }

    public void setCommentsWrite(ArrayList<String> commentsWrite) {
        this.commentsWrite = commentsWrite;
    }

    public ParsedData toParsedData(){
        ParsedData parsedData = new ParsedData();

        parsedData.setUsername(this.username);
        parsedData.setCountVideosWatched(this.countVideosWatched);
        parsedData.setCountVideoLiked(this.countVideoLiked);
        parsedData.setCountVideoShared(this.countVideoShared);
        parsedData.setCountFriendsVideosLiked(this.countFriendsVideosLiked);
        parsedData.setCountComments(this.countComments);
        parsedData.setCountUsedHashtags(this.countUsedHashtags);
        parsedData.setCountLivesWatched(this.countLivesWatched);
        parsedData.setMostUsedEmojis(this.mostUsedEmojis);
        parsedData.setCountLoginHistory(this.countLoginHistory);

        // Преобразуем списки в строки, разделённые запятыми
        parsedData.setUsedHashTags(this.usedHashTags != null ? String.join(",", this.usedHashTags) : null);
        parsedData.setShearList(this.shearList != null ? String.join(",", this.shearList) : null);
        parsedData.setCommentsWrite(this.commentsWrite != null ? String.join(",", this.commentsWrite) : null);

        return parsedData;
    }
}
