package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

import java.time.LocalDateTime;


public class CommentElement {
    private LocalDateTime commentTime;
    private String commentContent;
    private long rawTime;

    @JsonProperty("CommentTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getCommentTime() { return commentTime; }
    @JsonProperty("CommentTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setCommentTime(LocalDateTime value) { this.commentTime = value; }

    @JsonProperty("CommentContent")
    public String getCommentContent() { return commentContent; }
    @JsonProperty("CommentContent")
    public void setCommentContent(String value) { this.commentContent = value; }

    @JsonProperty("RawTime")
    public long getRawTime() { return rawTime; }
    @JsonProperty("RawTime")
    public void setRawTime(long value) { this.rawTime = value; }
}
