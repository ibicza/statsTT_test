package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

import java.time.LocalDateTime;

import java.util.List;

public class WatchLiveMap {
    private List<CommentElement> comments;
    private Object questions;
    private LocalDateTime watchTime;
    private String link;

    @JsonProperty("Comments")
    public List<CommentElement> getComments() { return comments; }
    @JsonProperty("Comments")
    public void setComments(List<CommentElement> value) { this.comments = value; }

    @JsonProperty("Questions")
    public Object getQuestions() { return questions; }
    @JsonProperty("Questions")
    public void setQuestions(Object value) { this.questions = value; }

    @JsonProperty("WatchTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getWatchTime() { return watchTime; }
    @JsonProperty("WatchTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setWatchTime(LocalDateTime value) { this.watchTime = value; }

    @JsonProperty("Link")
    public String getLink() { return link; }
    @JsonProperty("Link")
    public void setLink(String value) { this.link = value; }
}
