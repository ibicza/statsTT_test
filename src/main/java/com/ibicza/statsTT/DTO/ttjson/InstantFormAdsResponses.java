package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class InstantFormAdsResponses {
    private Object responsesList;

    @JsonProperty("ResponsesList")
    public Object getResponsesList() { return responsesList; }
    @JsonProperty("ResponsesList")
    public void setResponsesList(Object value) { this.responsesList = value; }
}
