package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;


@Data
public class ChatHistoryWith {
    private LocalDateTime date;
    private String from;
    private String content;

    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getDate() { return date; }
    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setDate(LocalDateTime value) { this.date = value; }

    @JsonProperty("From")
    public String getFrom() { return from; }
    @JsonProperty("From")
    public void setFrom(String value) { this.from = value; }

    @JsonProperty("Content")
    public String getContent() { return content; }
    @JsonProperty("Content")
    public void setContent(String value) { this.content = value; }
}
