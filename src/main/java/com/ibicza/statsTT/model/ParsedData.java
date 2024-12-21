package com.ibicza.statsTT.model;

import com.ibicza.statsTT.DTO.ParsedDataDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

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
    private int countLoginHistory;

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

    public ParsedDataDTO toParsedDataDTO() {
        ParsedDataDTO dto = new ParsedDataDTO();

        dto.setUsername(this.username);
        dto.setCountVideosWatched(this.countVideosWatched);
        dto.setCountVideoLiked(this.countVideoLiked);
        dto.setCountVideoShared(this.countVideoShared);
        dto.setCountFriendsVideosLiked(this.countFriendsVideosLiked);
        dto.setCountComments(this.countComments);
        dto.setCountUsedHashtags(this.countUsedHashtags);
        dto.setCountLivesWatched(this.countLivesWatched);
        dto.setMostUsedEmojis(this.mostUsedEmojis);
        dto.setCountLoginHistory(this.countLoginHistory);

        // Преобразуем строки в списки
        dto.setUsedHashTags(this.usedHashTags != null ? new ArrayList<>(List.of(this.usedHashTags.split(","))) : null);
        dto.setShearList(this.shearList != null ? new ArrayList<>(List.of(this.shearList.split(","))) : null);
        dto.setCommentsWrite(this.commentsWrite != null ? new ArrayList<>(List.of(this.commentsWrite.split(","))) : null);

        return dto;
    }


}
