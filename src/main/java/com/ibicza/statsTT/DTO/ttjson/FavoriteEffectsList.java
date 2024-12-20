package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.time.LocalDateTime;

public class FavoriteEffectsList {
    private LocalDateTime date;
    private String effectLink;

    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getDate() { return date; }
    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setDate(LocalDateTime value) { this.date = value; }

    @JsonProperty("EffectLink")
    public String getEffectLink() { return effectLink; }
    @JsonProperty("EffectLink")
    public void setEffectLink(String value) { this.effectLink = value; }
}
