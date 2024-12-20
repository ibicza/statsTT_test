package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class CommunicationHistory {
    private Object communicationHistories;

    @JsonProperty("CommunicationHistories")
    public Object getCommunicationHistories() { return communicationHistories; }
    @JsonProperty("CommunicationHistories")
    public void setCommunicationHistories(Object value) { this.communicationHistories = value; }
}
