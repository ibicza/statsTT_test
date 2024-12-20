package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class GoLiveHistory {
    private Object goLiveList;

    @JsonProperty("GoLiveList")
    public Object getGoLiveList() { return goLiveList; }
    @JsonProperty("GoLiveList")
    public void setGoLiveList(Object value) { this.goLiveList = value; }
}
