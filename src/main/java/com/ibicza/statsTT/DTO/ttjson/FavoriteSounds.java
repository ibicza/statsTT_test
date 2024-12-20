package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class FavoriteSounds {
    private List<FavoriteSoundListElement> favoriteSoundList;

    @JsonProperty("FavoriteSoundList")
    public List<FavoriteSoundListElement> getFavoriteSoundList() { return favoriteSoundList; }
    @JsonProperty("FavoriteSoundList")
    public void setFavoriteSoundList(List<FavoriteSoundListElement> value) { this.favoriteSoundList = value; }
}
