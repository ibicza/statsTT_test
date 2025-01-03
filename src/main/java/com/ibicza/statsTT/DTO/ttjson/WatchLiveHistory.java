package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

import java.util.Collections;
import java.util.Map;

public class WatchLiveHistory {
    private Map<String, WatchLiveMap> watchLiveMap;

    @JsonProperty("WatchLiveMap")
    public Map<String, WatchLiveMap> getWatchLiveMap() {
        return watchLiveMap != null ? watchLiveMap : Collections.emptyMap();
    }
    @JsonProperty("WatchLiveMap")
    public void setWatchLiveMap(Map<String, WatchLiveMap> value) { this.watchLiveMap = value; }
}
