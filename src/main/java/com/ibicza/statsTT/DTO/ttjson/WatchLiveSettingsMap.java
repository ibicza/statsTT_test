package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class WatchLiveSettingsMap {
    private String app;
    private String web;

    @JsonProperty("app")
    public String getApp() { return app; }
    @JsonProperty("app")
    public void setApp(String value) { this.app = value; }

    @JsonProperty("web")
    public String getWeb() { return web; }
    @JsonProperty("web")
    public void setWeb(String value) { this.web = value; }
}
