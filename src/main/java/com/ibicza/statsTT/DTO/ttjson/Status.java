package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Status {
    private List<StatusList> statusList;

    @JsonProperty("Status List")
    public List<StatusList> getStatusList() { return statusList; }
    @JsonProperty("Status List")
    public void setStatusList(List<StatusList> value) { this.statusList = value; }
}
