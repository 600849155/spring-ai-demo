package com.whohim.ai.openai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

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

    // 流式调用 将produces声明为文本事件流
    @GetMapping(value = "/stream",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> stream(String prompt){
        Flux<String> output = chatClient.prompt()
                .user(prompt)
                .stream()
                .content();
        return output;
    }
}