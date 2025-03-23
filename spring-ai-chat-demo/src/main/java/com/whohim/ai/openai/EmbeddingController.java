package com.whohim.ai.openai;

import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.embedding.EmbeddingRequest;
import org.springframework.ai.embedding.EmbeddingResponse;
import org.springframework.ai.openai.OpenAiEmbeddingOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmbeddingController {

    private final EmbeddingModel embeddingModel;

    @Autowired
    public EmbeddingController(EmbeddingModel embeddingModel) {
        this.embeddingModel = embeddingModel;
    }

    @GetMapping("/ai/embedding")
    public float[] embed(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
        String vectorString = "I'm learning Spring AI";
        EmbeddingRequest embeddingRequest =
                new EmbeddingRequest(List.of(vectorString),
                        OpenAiEmbeddingOptions.builder()
                                .withEncodingFormat("float")
                                .withModel("text-embedding-ada-002")
                                .build());

        EmbeddingResponse response = embeddingModel.call(embeddingRequest);
        System.out.println(response.getResult().getOutput());
        return response.getResult().getOutput();
    }
}