package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class WelcomeComment {
    private Comments comments;

    @JsonProperty("Comments")
    public Comments getComments() { return comments; }
    @JsonProperty("Comments")
    public void setComments(Comments value) { this.comments = value; }
}
