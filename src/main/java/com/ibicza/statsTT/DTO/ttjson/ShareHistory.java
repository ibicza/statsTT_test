package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ShareHistory {
    private List<ShareHistoryList> shareHistoryList;

    @JsonProperty("ShareHistoryList")
    public List<ShareHistoryList> getShareHistoryList() { return shareHistoryList; }
    @JsonProperty("ShareHistoryList")
    public void setShareHistoryList(List<ShareHistoryList> value) { this.shareHistoryList = value; }
}
