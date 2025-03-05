package com.mawen.learn.ai.deepseek.controller;

import com.mawen.learn.ai.deepseek.service.AIChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/ai/chat")
public class AIChatController {

    @Autowired
    private AIChatService chatService;

    @GetMapping
    public Flux<String> getResponse(@RequestParam("question") String question) {
        return chatService.getResponse(question);
    }
}
