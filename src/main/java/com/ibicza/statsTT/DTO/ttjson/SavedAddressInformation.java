package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class SavedAddressInformation {
    private Object savedAddress;

    @JsonProperty("SavedAddress")
    public Object getSavedAddress() { return savedAddress; }
    @JsonProperty("SavedAddress")
    public void setSavedAddress(Object value) { this.savedAddress = value; }
}
