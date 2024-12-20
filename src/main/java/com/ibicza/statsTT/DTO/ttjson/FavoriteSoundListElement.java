package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;


import java.time.LocalDateTime;


@JsonIgnoreProperties(ignoreUnknown = true)
public class FavoriteSoundListElement {
    private LocalDateTime date;
    private String link;


    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getDate() { return date; }
    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setDate(LocalDateTime value) { this.date = value; }

    @JsonProperty("Link")
    public String getLink() { return link; }
    @JsonProperty("Link")
    public void setLink(String value) { this.link = value; }
}
