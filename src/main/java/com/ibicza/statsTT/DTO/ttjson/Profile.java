package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class Profile {
    private AIMoji aiMoji;
    private AutoFill autoFill;
    private ProfileInformation profileInformation;

    @JsonProperty("AIMoji")
    public AIMoji getAiMoji() { return aiMoji; }
    @JsonProperty("AIMoji")
    public void setAiMoji(AIMoji value) { this.aiMoji = value; }

    @JsonProperty("Auto Fill")
    public AutoFill getAutoFill() { return autoFill; }
    @JsonProperty("Auto Fill")
    public void setAutoFill(AutoFill value) { this.autoFill = value; }

    @JsonProperty("Profile Information")
    public ProfileInformation getProfileInformation() { return profileInformation; }
    @JsonProperty("Profile Information")
    public void setProfileInformation(ProfileInformation value) { this.profileInformation = value; }
}
