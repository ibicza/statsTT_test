package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class OrderDisputeHistory {
    private Object orderDisputeHistories;

    @JsonProperty("OrderDisputeHistories")
    public Object getOrderDisputeHistories() { return orderDisputeHistories; }
    @JsonProperty("OrderDisputeHistories")
    public void setOrderDisputeHistories(Object value) { this.orderDisputeHistories = value; }
}
