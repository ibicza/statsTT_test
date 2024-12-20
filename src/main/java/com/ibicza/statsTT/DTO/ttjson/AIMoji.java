package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

@Data
public class AIMoji {
    private String createDate;
    private Object aiMojiList;

    @JsonProperty("CreateDate")
    public String getCreateDate() { return createDate; }
    @JsonProperty("CreateDate")
    public void setCreateDate(String value) { this.createDate = value; }

    @JsonProperty("AIMojiList")
    public Object getAiMojiList() { return aiMojiList; }
    @JsonProperty("AIMojiList")
    public void setAiMojiList(Object value) { this.aiMojiList = value; }
}
