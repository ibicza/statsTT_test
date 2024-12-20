package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ContentPreferences {
    private Object keywordFiltersForVideosInFollowingFeed;
    private Object keywordFiltersForVideosInForYouFeed;
    private List<String> videoLanguagesPreferences;

    @JsonProperty("Keyword filters for videos in Following feed")
    public Object getKeywordFiltersForVideosInFollowingFeed() { return keywordFiltersForVideosInFollowingFeed; }
    @JsonProperty("Keyword filters for videos in Following feed")
    public void setKeywordFiltersForVideosInFollowingFeed(Object value) { this.keywordFiltersForVideosInFollowingFeed = value; }

    @JsonProperty("Keyword filters for videos in For You feed")
    public Object getKeywordFiltersForVideosInForYouFeed() { return keywordFiltersForVideosInForYouFeed; }
    @JsonProperty("Keyword filters for videos in For You feed")
    public void setKeywordFiltersForVideosInForYouFeed(Object value) { this.keywordFiltersForVideosInForYouFeed = value; }

    @JsonProperty("Video Languages Preferences")
    public List<String> getVideoLanguagesPreferences() { return videoLanguagesPreferences; }
    @JsonProperty("Video Languages Preferences")
    public void setVideoLanguagesPreferences(List<String> value) { this.videoLanguagesPreferences = value; }
}
