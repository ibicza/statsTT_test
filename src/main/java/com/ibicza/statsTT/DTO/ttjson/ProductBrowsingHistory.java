package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class ProductBrowsingHistory {
    private Object productBrowsingHistories;

    @JsonProperty("ProductBrowsingHistories")
    public Object getProductBrowsingHistories() { return productBrowsingHistories; }
    @JsonProperty("ProductBrowsingHistories")
    public void setProductBrowsingHistories(Object value) { this.productBrowsingHistories = value; }
}
