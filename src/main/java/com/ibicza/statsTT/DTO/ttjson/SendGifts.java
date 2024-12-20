package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class SendGifts {
    private Object sendGifts;

    @JsonProperty("SendGifts")
    public Object getSendGifts() { return sendGifts; }
    @JsonProperty("SendGifts")
    public void setSendGifts(Object value) { this.sendGifts = value; }
}
