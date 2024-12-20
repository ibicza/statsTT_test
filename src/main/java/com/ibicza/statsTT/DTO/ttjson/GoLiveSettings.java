package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class GoLiveSettings {
    private GoLiveSettingsSettingsMap settingsMap;

    @JsonProperty("SettingsMap")
    public GoLiveSettingsSettingsMap getSettingsMap() { return settingsMap; }
    @JsonProperty("SettingsMap")
    public void setSettingsMap(GoLiveSettingsSettingsMap value) { this.settingsMap = value; }
}
