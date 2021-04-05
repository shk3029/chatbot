package me.js.chatbot.controller;

import lombok.extern.slf4j.Slf4j;
import me.js.chatbot.application.ChatBotService;
import me.js.chatbot.dto.ChatBotRequest;
import me.js.chatbot.dto.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/search", produces = MediaType.APPLICATION_JSON_VALUE)
public class ChatBotController {

    @Autowired
    private ChatBotService chatBotService;

    @PostMapping(value = "/chatA")
    public ResponseEntity<SearchResponse> chatbotA(@RequestBody ChatBotRequest chatBotRequest) {
        log.info("ChatBotController : request -> {}", chatBotRequest);
        SearchResponse searchResponse = chatBotService.getChatAResponse(chatBotRequest);
        log.info("AppSearchResponse : {}", searchResponse);
        return ResponseEntity.ok(searchResponse);
    }

    @PostMapping(value = "/chatB")
    public ResponseEntity<SearchResponse> chatbotB(@RequestBody ChatBotRequest chatBotRequest) {
        log.info("ChatBotController : request -> {}", chatBotRequest);
        SearchResponse searchResponse = chatBotService.getChatBResponse(chatBotRequest);
        log.info("AppSearchResponse : {}", searchResponse);
        return ResponseEntity.ok(searchResponse);
    }

    @PostMapping(value = "/chatC")
    public ResponseEntity<SearchResponse> chatbotC(@RequestBody ChatBotRequest chatBotRequest) {
        log.info("ChatBotController : request -> {}", chatBotRequest);
        SearchResponse searchResponse = chatBotService.getChatCResponse(chatBotRequest);
        log.info("AppSearchResponse : {}", searchResponse);
        return ResponseEntity.ok(searchResponse);
    }
}
