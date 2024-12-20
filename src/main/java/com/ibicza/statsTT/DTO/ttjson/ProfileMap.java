package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ProfileMap {
    private List<Object> platformInfo;
    private String bioDescription;
    private String birthDate;
    private String emailAddress;
    private String likesReceived;
    private String profilePhoto;
    private String profileVideo;
    private String telephoneNumber;
    private String userName;

    @JsonProperty("PlatformInfo")
    public List<Object> getPlatformInfo() { return platformInfo; }
    @JsonProperty("PlatformInfo")
    public void setPlatformInfo(List<Object> value) { this.platformInfo = value; }

    @JsonProperty("bioDescription")
    public String getBioDescription() { return bioDescription; }
    @JsonProperty("bioDescription")
    public void setBioDescription(String value) { this.bioDescription = value; }

    @JsonProperty("birthDate")
    public String getBirthDate() { return birthDate; }
    @JsonProperty("birthDate")
    public void setBirthDate(String value) { this.birthDate = value; }

    @JsonProperty("emailAddress")
    public String getEmailAddress() { return emailAddress; }
    @JsonProperty("emailAddress")
    public void setEmailAddress(String value) { this.emailAddress = value; }

    @JsonProperty("likesReceived")
    public String getLikesReceived() { return likesReceived; }
    @JsonProperty("likesReceived")
    public void setLikesReceived(String value) { this.likesReceived = value; }

    @JsonProperty("profilePhoto")
    public String getProfilePhoto() { return profilePhoto; }
    @JsonProperty("profilePhoto")
    public void setProfilePhoto(String value) { this.profilePhoto = value; }

    @JsonProperty("profileVideo")
    public String getProfileVideo() { return profileVideo; }
    @JsonProperty("profileVideo")
    public void setProfileVideo(String value) { this.profileVideo = value; }

    @JsonProperty("telephoneNumber")
    public String getTelephoneNumber() { return telephoneNumber; }
    @JsonProperty("telephoneNumber")
    public void setTelephoneNumber(String value) { this.telephoneNumber = value; }

    @JsonProperty("userName")
    public String getUserName() { return userName; }
    @JsonProperty("userName")
    public void setUserName(String value) { this.userName = value; }
}
