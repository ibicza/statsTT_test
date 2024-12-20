package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class Settings {
    private long app;
    private SettingsSettingsMap settingsMap;

    @JsonProperty("App")
    public long getApp() { return app; }
    @JsonProperty("App")
    public void setApp(long value) { this.app = value; }

    @JsonProperty("SettingsMap")
    public SettingsSettingsMap getSettingsMap() { return settingsMap; }
    @JsonProperty("SettingsMap")
    public void setSettingsMap(SettingsSettingsMap value) { this.settingsMap = value; }
}
