package com.ibicza.statsTT.DTO;

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
}
