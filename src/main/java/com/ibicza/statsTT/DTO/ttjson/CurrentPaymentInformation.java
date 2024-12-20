package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class CurrentPaymentInformation {
    private Object payCard;

    @JsonProperty("PayCard")
    public Object getPayCard() { return payCard; }
    @JsonProperty("PayCard")
    public void setPayCard(Object value) { this.payCard = value; }
}
