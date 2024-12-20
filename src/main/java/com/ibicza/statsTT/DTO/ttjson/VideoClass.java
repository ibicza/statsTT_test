package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class VideoClass {
    private RecentlyDeletedPosts recentlyDeletedPosts;
    private Video videos;

    @JsonProperty("RecentlyDeletedPosts")
    public RecentlyDeletedPosts getRecentlyDeletedPosts() { return recentlyDeletedPosts; }
    @JsonProperty("RecentlyDeletedPosts")
    public void setRecentlyDeletedPosts(RecentlyDeletedPosts value) { this.recentlyDeletedPosts = value; }

    @JsonProperty("Videos")
    public Video getVideos() { return videos; }
    @JsonProperty("Videos")
    public void setVideos(Video value) { this.videos = value; }
}
