package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class ProductReviewHistory {
    private Object productReviewHistories;

    @JsonProperty("ProductReviewHistories")
    public Object getProductReviewHistories() { return productReviewHistories; }
    @JsonProperty("ProductReviewHistories")
    public void setProductReviewHistories(Object value) { this.productReviewHistories = value; }
}
