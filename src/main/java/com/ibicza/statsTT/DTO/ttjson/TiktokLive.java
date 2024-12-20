package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class TiktokLive {
    private GoLiveHistory goLiveHistory;
    private GoLiveSettings goLiveSettings;
    private WatchLiveHistory watchLiveHistory;
    private WatchLiveSettings watchLiveSettings;

    @JsonProperty("Go Live History")
    public GoLiveHistory getGoLiveHistory() { return goLiveHistory; }
    @JsonProperty("Go Live History")
    public void setGoLiveHistory(GoLiveHistory value) { this.goLiveHistory = value; }

    @JsonProperty("Go Live Settings")
    public GoLiveSettings getGoLiveSettings() { return goLiveSettings; }
    @JsonProperty("Go Live Settings")
    public void setGoLiveSettings(GoLiveSettings value) { this.goLiveSettings = value; }

    @JsonProperty("Watch Live History")
    public WatchLiveHistory getWatchLiveHistory() { return watchLiveHistory; }
    @JsonProperty("Watch Live History")
    public void setWatchLiveHistory(WatchLiveHistory value) { this.watchLiveHistory = value; }

    @JsonProperty("Watch Live Settings")
    public WatchLiveSettings getWatchLiveSettings() { return watchLiveSettings; }
    @JsonProperty("Watch Live Settings")
    public void setWatchLiveSettings(WatchLiveSettings value) { this.watchLiveSettings = value; }
}
