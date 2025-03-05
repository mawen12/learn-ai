package com.mawen.learn.ai.deepseek.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AIConfig {

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder) {
        return builder
                .defaultSystem("You are an advanced AI assistant integrated into a Spring Boot application.Ensure clarity and accuracy in responses.")
                .build();
    }
}
