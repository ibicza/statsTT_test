package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

import java.time.LocalDateTime;

public class FansList {
    private LocalDateTime date;
    private String userName;

    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getDate() { return date; }
    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setDate(LocalDateTime value) { this.date = value; }

    @JsonProperty("UserName")
    public String getUserName() { return userName; }
    @JsonProperty("UserName")
    public void setUserName(String value) { this.userName = value; }
}
