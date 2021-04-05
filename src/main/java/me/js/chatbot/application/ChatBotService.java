package me.js.chatbot.application;

import lombok.extern.slf4j.Slf4j;
import me.js.chatbot.dto.ChatBotRequest;
import me.js.chatbot.dto.SearchResponse;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ChatBotService {

    public SearchResponse getChatAResponse(ChatBotRequest chatBotRequest) {

        try {
            log.info(">>>> Chatbot 데이터 조회중...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setQuery(chatBotRequest.getQuery());
        searchResponse.setType("chatA");
        searchResponse.setData(chatBotRequest.getQuery() + " 챗봇A 데이터");

        return searchResponse;
    }

    public SearchResponse getChatBResponse(ChatBotRequest chatBotRequest) {

        try {
            log.info(">>>> Chatbot 데이터 조회중...");
            Thread.sleep(3200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setQuery(chatBotRequest.getQuery());
        searchResponse.setType("chatB");
        searchResponse.setData(chatBotRequest.getQuery() + " 챗봇B 데이터");

        return searchResponse;
    }

    public SearchResponse getChatCResponse(ChatBotRequest chatBotRequest) {

        try {
            log.info(">>>> Chatbot 데이터 조회중...");
            Thread.sleep(1100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setQuery(chatBotRequest.getQuery());
        searchResponse.setType("chatC");
        searchResponse.setData(chatBotRequest.getQuery() + " 챗봇C 데이터");

        return searchResponse;
    }
}
