package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class SettingsSettingsMap {
    private String allowDownLoad;
    private String allowOthersToFindMe;
    private String appLanguage;
    private ContentPreferences contentPreferences;
    private LikeList familyContentPreferences;
    private String filterComments;
    private String interests;
    private String personalizedAds;
    private String privateAccount;
    private PushNotification pushNotification;
    private String suggestYourAccountToFacebookFriends;
    private String suggestYourAccountToContacts;
    private String suggestYourAccountToPeopleWhoOpenOrSendLinksToYou;
    private String webLanguage;
    private String whoCanDuetWithMe;
    private String whoCanPostComments;
    private String whoCanSendMeMessage;
    private String whoCanStitchWithYourVideos;
    private String whoCanViewVideosILiked;

    @JsonProperty("Allow DownLoad")
    public String getAllowDownLoad() { return allowDownLoad; }
    @JsonProperty("Allow DownLoad")
    public void setAllowDownLoad(String value) { this.allowDownLoad = value; }

    @JsonProperty("Allow Others to Find Me")
    public String getAllowOthersToFindMe() { return allowOthersToFindMe; }
    @JsonProperty("Allow Others to Find Me")
    public void setAllowOthersToFindMe(String value) { this.allowOthersToFindMe = value; }

    @JsonProperty("App Language")
    public String getAppLanguage() { return appLanguage; }
    @JsonProperty("App Language")
    public void setAppLanguage(String value) { this.appLanguage = value; }

    @JsonProperty("Content Preferences")
    public ContentPreferences getContentPreferences() { return contentPreferences; }
    @JsonProperty("Content Preferences")
    public void setContentPreferences(ContentPreferences value) { this.contentPreferences = value; }

    @JsonProperty("Family Content Preferences")
    public LikeList getFamilyContentPreferences() { return familyContentPreferences; }
    @JsonProperty("Family Content Preferences")
    public void setFamilyContentPreferences(LikeList value) { this.familyContentPreferences = value; }

    @JsonProperty("Filter Comments")
    public String getFilterComments() { return filterComments; }
    @JsonProperty("Filter Comments")
    public void setFilterComments(String value) { this.filterComments = value; }

    @JsonProperty("Interests")
    public String getInterests() { return interests; }
    @JsonProperty("Interests")
    public void setInterests(String value) { this.interests = value; }

    @JsonProperty("Personalized Ads")
    public String getPersonalizedAds() { return personalizedAds; }
    @JsonProperty("Personalized Ads")
    public void setPersonalizedAds(String value) { this.personalizedAds = value; }

    @JsonProperty("Private Account")
    public String getPrivateAccount() { return privateAccount; }
    @JsonProperty("Private Account")
    public void setPrivateAccount(String value) { this.privateAccount = value; }

    @JsonProperty("Push Notification")
    public PushNotification getPushNotification() { return pushNotification; }
    @JsonProperty("Push Notification")
    public void setPushNotification(PushNotification value) { this.pushNotification = value; }

    @JsonProperty("Suggest your account to Facebook friends")
    public String getSuggestYourAccountToFacebookFriends() { return suggestYourAccountToFacebookFriends; }
    @JsonProperty("Suggest your account to Facebook friends")
    public void setSuggestYourAccountToFacebookFriends(String value) { this.suggestYourAccountToFacebookFriends = value; }

    @JsonProperty("Suggest your account to contacts")
    public String getSuggestYourAccountToContacts() { return suggestYourAccountToContacts; }
    @JsonProperty("Suggest your account to contacts")
    public void setSuggestYourAccountToContacts(String value) { this.suggestYourAccountToContacts = value; }

    @JsonProperty("Suggest your account to people who open or send links to you")
    public String getSuggestYourAccountToPeopleWhoOpenOrSendLinksToYou() { return suggestYourAccountToPeopleWhoOpenOrSendLinksToYou; }
    @JsonProperty("Suggest your account to people who open or send links to you")
    public void setSuggestYourAccountToPeopleWhoOpenOrSendLinksToYou(String value) { this.suggestYourAccountToPeopleWhoOpenOrSendLinksToYou = value; }

    @JsonProperty("Web Language")
    public String getWebLanguage() { return webLanguage; }
    @JsonProperty("Web Language")
    public void setWebLanguage(String value) { this.webLanguage = value; }

    @JsonProperty("Who Can Duet With Me")
    public String getWhoCanDuetWithMe() { return whoCanDuetWithMe; }
    @JsonProperty("Who Can Duet With Me")
    public void setWhoCanDuetWithMe(String value) { this.whoCanDuetWithMe = value; }

    @JsonProperty("Who Can Post Comments")
    public String getWhoCanPostComments() { return whoCanPostComments; }
    @JsonProperty("Who Can Post Comments")
    public void setWhoCanPostComments(String value) { this.whoCanPostComments = value; }

    @JsonProperty("Who Can Send Me Message")
    public String getWhoCanSendMeMessage() { return whoCanSendMeMessage; }
    @JsonProperty("Who Can Send Me Message")
    public void setWhoCanSendMeMessage(String value) { this.whoCanSendMeMessage = value; }

    @JsonProperty("Who Can Stitch with your videos")
    public String getWhoCanStitchWithYourVideos() { return whoCanStitchWithYourVideos; }
    @JsonProperty("Who Can Stitch with your videos")
    public void setWhoCanStitchWithYourVideos(String value) { this.whoCanStitchWithYourVideos = value; }

    @JsonProperty("Who Can View Videos I Liked")
    public String getWhoCanViewVideosILiked() { return whoCanViewVideosILiked; }
    @JsonProperty("Who Can View Videos I Liked")
    public void setWhoCanViewVideosILiked(String value) { this.whoCanViewVideosILiked = value; }
}
