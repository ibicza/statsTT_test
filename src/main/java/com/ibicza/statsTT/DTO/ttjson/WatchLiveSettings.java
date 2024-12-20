package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class WatchLiveSettings {
    private WatchLiveSettingsMap watchLiveSettingsMap;
    private String mostRecentModificationTimeInApp;
    private String mostRecentModificationTimeInWeb;

    @JsonProperty("WatchLiveSettingsMap")
    public WatchLiveSettingsMap getWatchLiveSettingsMap() { return watchLiveSettingsMap; }
    @JsonProperty("WatchLiveSettingsMap")
    public void setWatchLiveSettingsMap(WatchLiveSettingsMap value) { this.watchLiveSettingsMap = value; }

    @JsonProperty("MostRecentModificationTimeInApp")
    public String getMostRecentModificationTimeInApp() { return mostRecentModificationTimeInApp; }
    @JsonProperty("MostRecentModificationTimeInApp")
    public void setMostRecentModificationTimeInApp(String value) { this.mostRecentModificationTimeInApp = value; }

    @JsonProperty("MostRecentModificationTimeInWeb")
    public String getMostRecentModificationTimeInWeb() { return mostRecentModificationTimeInWeb; }
    @JsonProperty("MostRecentModificationTimeInWeb")
    public void setMostRecentModificationTimeInWeb(String value) { this.mostRecentModificationTimeInWeb = value; }
}
