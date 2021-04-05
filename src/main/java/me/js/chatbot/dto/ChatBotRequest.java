package me.js.chatbot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatBotRequest {

    private String query;

    @Override
    public String toString() {
        return "ChatBotRequest{" +
                "query='" + query + '\'' +
                '}';
    }
}
