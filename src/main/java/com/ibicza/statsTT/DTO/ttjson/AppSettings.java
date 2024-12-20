package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

@Data
public class AppSettings {
    private Block block;
    private Settings settings;

    @JsonProperty("Block")
    public Block getBlock() { return block; }
    @JsonProperty("Block")
    public void setBlock(Block value) { this.block = value; }

    @JsonProperty("Settings")
    public Settings getSettings() { return settings; }
    @JsonProperty("Settings")
    public void setSettings(Settings value) { this.settings = value; }
}
