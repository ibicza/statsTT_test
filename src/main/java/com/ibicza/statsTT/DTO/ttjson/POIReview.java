package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class POIReview {
    private Object reviewsList;

    @JsonProperty("ReviewsList")
    public Object getReviewsList() { return reviewsList; }
    @JsonProperty("ReviewsList")
    public void setReviewsList(Object value) { this.reviewsList = value; }
}
