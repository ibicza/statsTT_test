package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

import java.time.LocalDateTime;


public class ShareHistoryList {
    private LocalDateTime date;
    private String sharedContent;
    private String link;
    private String method;

    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getDate() { return date; }
    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setDate(LocalDateTime value) { this.date = value; }

    @JsonProperty("SharedContent")
    public String getSharedContent() { return sharedContent; }
    @JsonProperty("SharedContent")
    public void setSharedContent(String value) { this.sharedContent = value; }

    @JsonProperty("Link")
    public String getLink() { return link; }
    @JsonProperty("Link")
    public void setLink(String value) { this.link = value; }

    @JsonProperty("Method")
    public String getMethod() { return method; }
    @JsonProperty("Method")
    public void setMethod(String value) { this.method = value; }
}
