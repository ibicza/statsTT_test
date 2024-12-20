package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

import java.time.LocalDateTime;


public class SearchList {
    private LocalDateTime date;
    private String searchTerm;

    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getDate() { return date; }
    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setDate(LocalDateTime value) { this.date = value; }

    @JsonProperty("SearchTerm")
    public String getSearchTerm() { return searchTerm; }
    @JsonProperty("SearchTerm")
    public void setSearchTerm(String value) { this.searchTerm = value; }
}
