package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

@Data
public class Activity {
    private FavoriteEffects favoriteEffects;
    private FavoriteHashtags favoriteHashtags;
    private FavoriteSounds favoriteSounds;
    private FavoriteVideos favoriteVideos;
    private FollowerList followerList;
    private FollowingList followingList;
    private Hashtag hashtag;
    private LikeList likeList;
    private LoginHistory loginHistory;
    private PurchaseHistory purchaseHistory;
    private SearchHistory searchHistory;
    private ShareHistory shareHistory;
    private Status status;
    private Video videoBrowsingHistory;

    @JsonProperty("Favorite Effects")
    public FavoriteEffects getFavoriteEffects() { return favoriteEffects; }
    @JsonProperty("Favorite Effects")
    public void setFavoriteEffects(FavoriteEffects value) { this.favoriteEffects = value; }

    @JsonProperty("Favorite Hashtags")
    public FavoriteHashtags getFavoriteHashtags() { return favoriteHashtags; }
    @JsonProperty("Favorite Hashtags")
    public void setFavoriteHashtags(FavoriteHashtags value) { this.favoriteHashtags = value; }

    @JsonProperty("Favorite Sounds")
    public FavoriteSounds getFavoriteSounds() { return favoriteSounds; }
    @JsonProperty("Favorite Sounds")
    public void setFavoriteSounds(FavoriteSounds value) { this.favoriteSounds = value; }

    @JsonProperty("Favorite Videos")
    public FavoriteVideos getFavoriteVideos() { return favoriteVideos; }
    @JsonProperty("Favorite Videos")
    public void setFavoriteVideos(FavoriteVideos value) { this.favoriteVideos = value; }

    @JsonProperty("Follower List")
    public FollowerList getFollowerList() { return followerList; }
    @JsonProperty("Follower List")
    public void setFollowerList(FollowerList value) { this.followerList = value; }

    @JsonProperty("Following List")
    public FollowingList getFollowingList() { return followingList; }
    @JsonProperty("Following List")
    public void setFollowingList(FollowingList value) { this.followingList = value; }

    @JsonProperty("Hashtag")
    public Hashtag getHashtag() { return hashtag; }
    @JsonProperty("Hashtag")
    public void setHashtag(Hashtag value) { this.hashtag = value; }

    @JsonProperty("Like List")
    public LikeList getLikeList() { return likeList; }
    @JsonProperty("Like List")
    public void setLikeList(LikeList value) { this.likeList = value; }

    @JsonProperty("Login History")
    public LoginHistory getLoginHistory() { return loginHistory; }
    @JsonProperty("Login History")
    public void setLoginHistory(LoginHistory value) { this.loginHistory = value; }

    @JsonProperty("Purchase History")
    public PurchaseHistory getPurchaseHistory() { return purchaseHistory; }
    @JsonProperty("Purchase History")
    public void setPurchaseHistory(PurchaseHistory value) { this.purchaseHistory = value; }

    @JsonProperty("Search History")
    public SearchHistory getSearchHistory() { return searchHistory; }
    @JsonProperty("Search History")
    public void setSearchHistory(SearchHistory value) { this.searchHistory = value; }

    @JsonProperty("Share History")
    public ShareHistory getShareHistory() { return shareHistory; }
    @JsonProperty("Share History")
    public void setShareHistory(ShareHistory value) { this.shareHistory = value; }

    @JsonProperty("Status")
    public Status getStatus() { return status; }
    @JsonProperty("Status")
    public void setStatus(Status value) { this.status = value; }

    @JsonProperty("Video Browsing History")
    public Video getVideoBrowsingHistory() { return videoBrowsingHistory; }
    @JsonProperty("Video Browsing History")
    public void setVideoBrowsingHistory(Video value) { this.videoBrowsingHistory = value; }
}
