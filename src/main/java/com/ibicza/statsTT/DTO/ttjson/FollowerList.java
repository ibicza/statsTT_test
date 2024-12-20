package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class FollowerList {
    private long app;
    private boolean isFastLane;
    private List<FansList> fansList;

    @JsonProperty("App")
    public long getApp() { return app; }
    @JsonProperty("App")
    public void setApp(long value) { this.app = value; }

    @JsonProperty("IsFastLane")
    public boolean getIsFastLane() { return isFastLane; }
    @JsonProperty("IsFastLane")
    public void setIsFastLane(boolean value) { this.isFastLane = value; }

    @JsonProperty("FansList")
    public List<FansList> getFansList() { return fansList; }
    @JsonProperty("FansList")
    public void setFansList(List<FansList> value) { this.fansList = value; }
}
