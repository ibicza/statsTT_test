package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class ReturnAndRefundHistory {
    private Object returnAndRefundHistories;

    @JsonProperty("ReturnAndRefundHistories")
    public Object getReturnAndRefundHistories() { return returnAndRefundHistories; }
    @JsonProperty("ReturnAndRefundHistories")
    public void setReturnAndRefundHistories(Object value) { this.returnAndRefundHistories = value; }
}
