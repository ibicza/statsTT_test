package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

import java.time.LocalDateTime;


public class OffTikTokActivityDataList {
    private LocalDateTime timeStamp;
    private String source;
    private String event;

    @JsonProperty("TimeStamp")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getTimeStamp() { return timeStamp; }
    @JsonProperty("TimeStamp")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setTimeStamp(LocalDateTime value) { this.timeStamp = value; }

    @JsonProperty("Source")
    public String getSource() { return source; }
    @JsonProperty("Source")
    public void setSource(String value) { this.source = value; }

    @JsonProperty("Event")
    public String getEvent() { return event; }
    @JsonProperty("Event")
    public void setEvent(String value) { this.event = value; }
}
