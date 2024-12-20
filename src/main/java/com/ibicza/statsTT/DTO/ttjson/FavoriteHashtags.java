package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class FavoriteHashtags {
    private Object favoriteHashtagList;

    @JsonProperty("FavoriteHashtagList")
    public Object getFavoriteHashtagList() { return favoriteHashtagList; }
    @JsonProperty("FavoriteHashtagList")
    public void setFavoriteHashtagList(Object value) { this.favoriteHashtagList = value; }
}
