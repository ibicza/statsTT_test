package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class PurchaseHistory {
    private SendGifts sendGifts;
    private BuyGifts buyGifts;

    @JsonProperty("SendGifts")
    public SendGifts getSendGifts() { return sendGifts; }
    @JsonProperty("SendGifts")
    public void setSendGifts(SendGifts value) { this.sendGifts = value; }

    @JsonProperty("BuyGifts")
    public BuyGifts getBuyGifts() { return buyGifts; }
    @JsonProperty("BuyGifts")
    public void setBuyGifts(BuyGifts value) { this.buyGifts = value; }
}
