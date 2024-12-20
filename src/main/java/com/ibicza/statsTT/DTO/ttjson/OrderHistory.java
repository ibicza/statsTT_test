package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class OrderHistory {
    private Object orderHistories;

    @JsonProperty("OrderHistories")
    public Object getOrderHistories() { return orderHistories; }
    @JsonProperty("OrderHistories")
    public void setOrderHistories(Object value) { this.orderHistories = value; }
}
