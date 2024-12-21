package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

import java.util.Collections;
import java.util.List;

public class Video {
    private List<FavoriteSoundListElement> videoList;

    @JsonProperty("VideoList")
    public List<FavoriteSoundListElement> getVideoList() {
        return videoList != null ? videoList : Collections.emptyList();
    }
    @JsonProperty("VideoList")
    public void setVideoList(List<FavoriteSoundListElement> value) { this.videoList = value; }
}
