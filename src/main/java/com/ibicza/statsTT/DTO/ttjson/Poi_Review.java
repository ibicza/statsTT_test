package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Poi_Review {
    @JsonProperty("POI Review")
    private POIReview poiReview;
}
