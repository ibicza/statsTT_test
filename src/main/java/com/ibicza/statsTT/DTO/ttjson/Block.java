package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

@Data
public class Block {
    private long app;
    private Object blockList;

    @JsonProperty("App")
    public long getApp() { return app; }
    @JsonProperty("App")
    public void setApp(long value) { this.app = value; }

    @JsonProperty("BlockList")
    public Object getBlockList() { return blockList; }
    @JsonProperty("BlockList")
    public void setBlockList(Object value) { this.blockList = value; }
}
