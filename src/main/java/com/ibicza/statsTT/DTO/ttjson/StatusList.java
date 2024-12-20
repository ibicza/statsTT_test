package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

public class StatusList {
    private String resolution;
    private String appVersion;
    private String idfa;
    private UUID gaid;
    private String androidId;
    private String idfv;
    private String webId;

    @JsonProperty("Resolution")
    public String getResolution() { return resolution; }
    @JsonProperty("Resolution")
    public void setResolution(String value) { this.resolution = value; }

    @JsonProperty("App Version")
    public String getAppVersion() { return appVersion; }
    @JsonProperty("App Version")
    public void setAppVersion(String value) { this.appVersion = value; }

    @JsonProperty("IDFA")
    public String getIdfa() { return idfa; }
    @JsonProperty("IDFA")
    public void setIdfa(String value) { this.idfa = value; }

    @JsonProperty("GAID")
    public UUID getGaid() { return gaid; }
    @JsonProperty("GAID")
    public void setGaid(UUID value) { this.gaid = value; }

    @JsonProperty("Android ID")
    public String getAndroidId() { return androidId; }
    @JsonProperty("Android ID")
    public void setAndroidId(String value) { this.androidId = value; }

    @JsonProperty("IDFV")
    public String getIdfv() { return idfv; }
    @JsonProperty("IDFV")
    public void setIdfv(String value) { this.idfv = value; }

    @JsonProperty("Web ID")
    public String getWebId() { return webId; }
    @JsonProperty("Web ID")
    public void setWebId(String value) { this.webId = value; }
}
