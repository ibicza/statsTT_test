package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class FavoriteVideos {
    private long app;
    private List<FavoriteSoundListElement> favoriteVideoList;

    @JsonProperty("App")
    public long getApp() { return app; }
    @JsonProperty("App")
    public void setApp(long value) { this.app = value; }

    @JsonProperty("FavoriteVideoList")
    public List<FavoriteSoundListElement> getFavoriteVideoList() { return favoriteVideoList; }
    @JsonProperty("FavoriteVideoList")
    public void setFavoriteVideoList(List<FavoriteSoundListElement> value) { this.favoriteVideoList = value; }
}
