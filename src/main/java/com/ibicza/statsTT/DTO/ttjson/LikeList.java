package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LikeList {

    @JsonProperty("App")
    private Integer app;

    @JsonProperty("ItemFavoriteList")
    public List<ItemFavorite> itemFavoriteList = new ArrayList<>();

    public Integer getApp() {
        return app;
    }

    public void setApp(Integer app) {
        this.app = app;
    }

    public List<ItemFavorite> getItemFavoriteList() {
        return itemFavoriteList;
    }

    public void setItemFavoriteList(List<ItemFavorite> itemFavoriteList) {
        this.itemFavoriteList = itemFavoriteList;
    }
}

