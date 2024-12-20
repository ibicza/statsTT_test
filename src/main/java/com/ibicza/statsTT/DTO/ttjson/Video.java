package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Video {
    private List<FavoriteSoundListElement> videoList;

    @JsonProperty("VideoList")
    public List<FavoriteSoundListElement> getVideoList() { return videoList; }
    @JsonProperty("VideoList")
    public void setVideoList(List<FavoriteSoundListElement> value) { this.videoList = value; }
}
