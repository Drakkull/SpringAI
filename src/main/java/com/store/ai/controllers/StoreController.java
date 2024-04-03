package com.store.ai.controllers;


import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreController {

    private final OpenAiChatClient chatClient;



    public StoreController(OpenAiChatClient chatClient) {
        this.chatClient = chatClient;
    }


    @GetMapping("/informations")
    public String storeChat(@RequestParam(value = "message", defaultValue = "Tell me the top 5 best seller books of all time?")String message){

        return chatClient.call(message);

    }


}
