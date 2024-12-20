package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class CustomerSupportHistory {
    private Object customerSupportHistories;

    @JsonProperty("CustomerSupportHistories")
    public Object getCustomerSupportHistories() { return customerSupportHistories; }
    @JsonProperty("CustomerSupportHistories")
    public void setCustomerSupportHistories(Object value) { this.customerSupportHistories = value; }
}
