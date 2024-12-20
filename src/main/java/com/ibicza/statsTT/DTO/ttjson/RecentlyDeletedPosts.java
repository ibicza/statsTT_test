package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class RecentlyDeletedPosts {
    private Object postList;

    @JsonProperty("PostList")
    public Object getPostList() { return postList; }
    @JsonProperty("PostList")
    public void setPostList(Object value) { this.postList = value; }
}
