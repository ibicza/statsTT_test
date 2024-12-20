package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class ProfileInformation {
    private long app;
    private ProfileMap profileMap;

    @JsonProperty("App")
    public long getApp() { return app; }
    @JsonProperty("App")
    public void setApp(long value) { this.app = value; }

    @JsonProperty("ProfileMap")
    public ProfileMap getProfileMap() { return profileMap; }
    @JsonProperty("ProfileMap")
    public void setProfileMap(ProfileMap value) { this.profileMap = value; }
}
