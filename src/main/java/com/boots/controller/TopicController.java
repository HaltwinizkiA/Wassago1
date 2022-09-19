package com.boots.controller;

import com.boots.service.TopicService;
import com.boots.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public String TopicsList(Model model){
        model.addAttribute("allTopic", topicService.allTopic());
        return "topics";
    }

    @GetMapping("/topic/{id}")
     public String topic(@PathVariable Long id,Model model){
        model.addAttribute("topic",topicService.getTopic(id));
        return "topic";
    }

}
