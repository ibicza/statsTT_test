package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

import java.util.Collections;
import java.util.List;

public class Hashtag {
    private List<HashtagList> hashtagList;

    @JsonProperty("HashtagList")
    public List<HashtagList> getHashtagList() {
        return hashtagList != null ? hashtagList : Collections.emptyList();

    }
    @JsonProperty("HashtagList")
    public void setHashtagList(List<HashtagList> value) { this.hashtagList = value; }
}
