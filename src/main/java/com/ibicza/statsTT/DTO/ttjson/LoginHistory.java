package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LoginHistory {
    private List<LoginHistoryList> loginHistoryList;

    @JsonProperty("LoginHistoryList")
    public List<LoginHistoryList> getLoginHistoryList() { return loginHistoryList; }
    @JsonProperty("LoginHistoryList")
    public void setLoginHistoryList(List<LoginHistoryList> value) { this.loginHistoryList = value; }
}
