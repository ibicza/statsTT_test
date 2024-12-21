package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

import java.util.Collections;
import java.util.List;

public class Comments {
    private long app;
    private List<CommentsList> commentsList;

    @JsonProperty("App")
    public long getApp() { return app; }
    @JsonProperty("App")
    public void setApp(long value) { this.app = value; }

    @JsonProperty("CommentsList")
    public List<CommentsList> getCommentsList() {
        return commentsList != null ? commentsList : Collections.emptyList();

    }
    @JsonProperty("CommentsList")
    public void setCommentsList(List<CommentsList> value) { this.commentsList = value; }
}
