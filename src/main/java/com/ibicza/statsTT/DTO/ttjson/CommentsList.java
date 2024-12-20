package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

import java.time.LocalDateTime;


public class CommentsList {
    private LocalDateTime date;
    private String comment;
    private String photo;
    private String url;

    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getDate() { return date; }
    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setDate(LocalDateTime value) { this.date = value; }

    @JsonProperty("comment")
    public String getComment() { return comment; }
    @JsonProperty("comment")
    public void setComment(String value) { this.comment = value; }

    @JsonProperty("photo")
    public String getPhoto() { return photo; }
    @JsonProperty("photo")
    public void setPhoto(String value) { this.photo = value; }

    @JsonProperty("url")
    public String getUrl() { return url; }
    @JsonProperty("url")
    public void setUrl(String value) { this.url = value; }
}
