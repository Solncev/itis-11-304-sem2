package com.solncev.controller;

import com.solncev.dto.MessageDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

    @GetMapping("chat")
    public String getChat(){
        return "chat";
    }

    @MessageMapping("/message")
    @SendTo("/topic/message")
    public MessageDto message(MessageDto messageDto) {
        return new MessageDto("Hello, %s".formatted(messageDto.getSender()), "server");
    }
}
