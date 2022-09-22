package com.boots.controller;

import com.boots.entity.Message;
import com.boots.entity.User;
import com.boots.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MessageController {
    @Autowired
    MessageService messageService;

    @GetMapping("/topicMessages/{id}")
    public String topicMessages(@PathVariable Long id, Model model) {
        model.addAttribute("topicMessage", messageService.topicMessage(id));
        return "topicMessages";
    }


    @PostMapping("/topic/{topicId}")
    public String addMessage(@ModelAttribute("messageForm") @Valid Message message, @AuthenticationPrincipal User user, @PathVariable Long topicId, Model model) {
        messageService.addMessage(message, user, topicId);
        return "redirect:/topic/" + topicId;
    }
}
