package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

@Data
public class DirectMessages {
    private ChatHistory chatHistory;

    @JsonProperty("Chat History")
    public ChatHistory getChatHistory() { return chatHistory; }
    @JsonProperty("Chat History")
    public void setChatHistory(ChatHistory value) { this.chatHistory = value; }
}
