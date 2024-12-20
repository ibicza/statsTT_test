package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

@Data
public class BuyGifts {
    private Object buyGifts;

    @JsonProperty("BuyGifts")
    public Object getBuyGifts() { return buyGifts; }
    @JsonProperty("BuyGifts")
    public void setBuyGifts(Object value) { this.buyGifts = value; }
}
