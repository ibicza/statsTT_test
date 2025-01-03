package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

import java.util.Collections;
import java.util.List;

public class SearchHistory {
    private List<SearchList> searchList;

    @JsonProperty("SearchList")
    public List<SearchList> getSearchList() {
        return searchList != null ? searchList : Collections.emptyList();

    }
    @JsonProperty("SearchList")
    public void setSearchList(List<SearchList> value) { this.searchList = value; }
}
