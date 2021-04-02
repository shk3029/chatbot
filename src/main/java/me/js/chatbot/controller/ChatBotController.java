package me.js.chatbot.controller;

import lombok.extern.slf4j.Slf4j;
import me.js.chatbot.dto.ChatBotRequest;
import me.js.chatbot.dto.ChatBotResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/chatbot")
public class ChatBotController {

    @PostMapping
    public ChatBotResponse chatbot(@RequestBody ChatBotRequest chatBotRequest) {
        log.info("ChatBotController : request -> {}", chatBotRequest);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ChatBotResponse();
    }
}
