package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class FavoriteEffects {
    private List<FavoriteEffectsList> favoriteEffectsList;

    @JsonProperty("FavoriteEffectsList")
    public List<FavoriteEffectsList> getFavoriteEffectsList() { return favoriteEffectsList; }
    @JsonProperty("FavoriteEffectsList")
    public void setFavoriteEffectsList(List<FavoriteEffectsList> value) { this.favoriteEffectsList = value; }
}
