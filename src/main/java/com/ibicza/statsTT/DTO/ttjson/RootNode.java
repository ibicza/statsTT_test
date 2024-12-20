package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class RootNode {
    private Activity activity;
    private AdsAndData adsAndData;
    private AppSettings appSettings;
    private WelcomeComment comment;
    private DirectMessages directMessages;
    private IncomePlusWalletTransactions incomePlusWalletTransactions;
    private Poi_Review poiReview;
    private Profile profile;
    private TiktokLive tiktokLive;
    private TiktokShopping tiktokShopping;
    private VideoClass video;

    @JsonProperty("Activity")
    public Activity getActivity() { return activity; }
    @JsonProperty("Activity")
    public void setActivity(Activity value) { this.activity = value; }

    @JsonProperty("Ads and data")
    public AdsAndData getAdsAndData() { return adsAndData; }
    @JsonProperty("Ads and data")
    public void setAdsAndData(AdsAndData value) { this.adsAndData = value; }

    @JsonProperty("App Settings")
    public AppSettings getAppSettings() { return appSettings; }
    @JsonProperty("App Settings")
    public void setAppSettings(AppSettings value) { this.appSettings = value; }

    @JsonProperty("Comment")
    public WelcomeComment getComment() { return comment; }
    @JsonProperty("Comment")
    public void setComment(WelcomeComment value) { this.comment = value; }

    @JsonProperty("Direct Messages")
    public DirectMessages getDirectMessages() { return directMessages; }
    @JsonProperty("Direct Messages")
    public void setDirectMessages(DirectMessages value) { this.directMessages = value; }

    @JsonProperty("Income Plus Wallet Transactions")
    public IncomePlusWalletTransactions getIncomePlusWalletTransactions() { return incomePlusWalletTransactions; }
    @JsonProperty("Income Plus Wallet Transactions")
    public void setIncomePlusWalletTransactions(IncomePlusWalletTransactions value) { this.incomePlusWalletTransactions = value; }

    @JsonProperty("Poi Review")
    public Poi_Review getPoiReview() { return poiReview; }
    @JsonProperty("Poi Review")
    public void setPoiReview(Poi_Review value) { this.poiReview = value; }

    @JsonProperty("Profile")
    public Profile getProfile() { return profile; }
    @JsonProperty("Profile")
    public void setProfile(Profile value) { this.profile = value; }

    @JsonProperty("Tiktok Live")
    public TiktokLive getTiktokLive() { return tiktokLive; }
    @JsonProperty("Tiktok Live")
    public void setTiktokLive(TiktokLive value) { this.tiktokLive = value; }

    @JsonProperty("Tiktok Shopping")
    public TiktokShopping getTiktokShopping() { return tiktokShopping; }
    @JsonProperty("Tiktok Shopping")
    public void setTiktokShopping(TiktokShopping value) { this.tiktokShopping = value; }

    @JsonProperty("Video")
    public VideoClass getVideo() { return video; }
    @JsonProperty("Video")
    public void setVideo(VideoClass value) { this.video = value; }
}
