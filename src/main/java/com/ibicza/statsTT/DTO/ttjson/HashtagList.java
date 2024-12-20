package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class HashtagList {
    private String hashtagName;
    private String hashtagLink;

    @JsonProperty("HashtagName")
    public String getHashtagName() { return hashtagName; }
    @JsonProperty("HashtagName")
    public void setHashtagName(String value) { this.hashtagName = value; }

    @JsonProperty("HashtagLink")
    public String getHashtagLink() { return hashtagLink; }
    @JsonProperty("HashtagLink")
    public void setHashtagLink(String value) { this.hashtagLink = value; }
}
