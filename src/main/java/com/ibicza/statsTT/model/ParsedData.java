package com.ibicza.statsTT.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "parsed_data")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ParsedData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private int countVideosWatched;
    private int countVideoLiked;
    private int countVideoShared;
    private int countFriendsVideosLiked;
    private int countComments;
    private int countUsedHashtags;
    private int countLivesWatched;

    private String mostUsedEmojis;

    @Column(columnDefinition = "TEXT")
    private String usedHashTags;

    @Column(columnDefinition = "TEXT")
    private String shearList;

    @Column(columnDefinition = "TEXT")
    private String commentsWrite;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getUsedHashTags() {
        return usedHashTags;
    }

    public void setUsedHashTags(String usedHashTags) {
        this.usedHashTags = usedHashTags;
    }

    public String getShearList() {
        return shearList;
    }

    public void setShearList(String shearList) {
        this.shearList = shearList;
    }

    public String getCommentsWrite() {
        return commentsWrite;
    }

    public void setCommentsWrite(String commentsWrite) {
        this.commentsWrite = commentsWrite;
    }
}
