package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ChatHistory {
    private Map<String, List<ChatHistoryWith>> chatHistory;

    @JsonProperty("ChatHistory")
    public Map<String, List<ChatHistoryWith>> getChatHistory() { return chatHistory; }

    @JsonProperty("ChatHistory")
    public void setChatHistory(Map<String, List<ChatHistoryWith>> chatHistory) {
        this.chatHistory = chatHistory;
    }
}


