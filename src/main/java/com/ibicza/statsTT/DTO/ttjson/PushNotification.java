package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class PushNotification {
    private String desktopNotification;
    private String newCommentsOnMyVideo;
    private String newFans;
    private String newLikesOnMyVideo;

    @JsonProperty("Desktop notification")
    public String getDesktopNotification() { return desktopNotification; }
    @JsonProperty("Desktop notification")
    public void setDesktopNotification(String value) { this.desktopNotification = value; }

    @JsonProperty("New Comments on My Video")
    public String getNewCommentsOnMyVideo() { return newCommentsOnMyVideo; }
    @JsonProperty("New Comments on My Video")
    public void setNewCommentsOnMyVideo(String value) { this.newCommentsOnMyVideo = value; }

    @JsonProperty("New Fans")
    public String getNewFans() { return newFans; }
    @JsonProperty("New Fans")
    public void setNewFans(String value) { this.newFans = value; }

    @JsonProperty("New Likes on My Video")
    public String getNewLikesOnMyVideo() { return newLikesOnMyVideo; }
    @JsonProperty("New Likes on My Video")
    public void setNewLikesOnMyVideo(String value) { this.newLikesOnMyVideo = value; }
}
