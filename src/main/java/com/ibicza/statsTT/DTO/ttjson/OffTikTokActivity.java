package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class OffTikTokActivity {
    private List<OffTikTokActivityDataList> offTikTokActivityDataList;

    @JsonProperty("OffTikTokActivityDataList")
    public List<OffTikTokActivityDataList> getOffTikTokActivityDataList() { return offTikTokActivityDataList; }
    @JsonProperty("OffTikTokActivityDataList")
    public void setOffTikTokActivityDataList(List<OffTikTokActivityDataList> value) { this.offTikTokActivityDataList = value; }
}
