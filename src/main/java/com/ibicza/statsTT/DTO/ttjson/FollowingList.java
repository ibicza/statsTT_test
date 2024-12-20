package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class FollowingList {
    private long app;
    private boolean isFastLane;
    private List<FansList> following;

    @JsonProperty("App")
    public long getApp() { return app; }
    @JsonProperty("App")
    public void setApp(long value) { this.app = value; }

    @JsonProperty("IsFastLane")
    public boolean getIsFastLane() { return isFastLane; }
    @JsonProperty("IsFastLane")
    public void setIsFastLane(boolean value) { this.isFastLane = value; }

    @JsonProperty("Following")
    public List<FansList> getFollowing() { return following; }
    @JsonProperty("Following")
    public void setFollowing(List<FansList> value) { this.following = value; }
}
