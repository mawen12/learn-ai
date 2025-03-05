package com.mawen.learn.ai.deepseek.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class AIChatService {

    @Autowired
    private ChatClient chatClient;

    public Flux<String> getResponse(String question) {
        return chatClient.prompt(question)
                .stream()
                .content();
    }

}
