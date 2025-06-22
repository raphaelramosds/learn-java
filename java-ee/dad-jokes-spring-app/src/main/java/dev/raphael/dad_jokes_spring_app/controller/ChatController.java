package dev.raphael.dad_jokes_spring_app.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final ChatClient.Builder builder;

    public ChatController(ChatClient.Builder builder) {
        this.builder = builder;
    }

    @GetMapping("/generate")
    public String generate(@RequestParam(value = "message", defaultValue = "Tell me a dad joke") String message) {
        ChatClient chatClient = this.builder.build();
        return chatClient.prompt(message).call().content();
    }
}
