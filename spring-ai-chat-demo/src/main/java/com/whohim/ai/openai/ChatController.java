package com.whohim.ai.openai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }

    @GetMapping("/demo")
    public String chat(String userInput) {

        return this.chatClient.prompt()
                .user(userInput)
                .call()
                .content();
    }

}