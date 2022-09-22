package com.boots.controller;

import com.boots.entity.Topic;
import com.boots.entity.User;
import com.boots.service.MessageService;
import com.boots.service.TopicService;
import com.boots.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class TopicController {
    @Autowired
    private TopicService topicService;
    @Autowired
    MessageService messageService;

    @GetMapping("/topics")
    public String TopicsList(Model model){
        model.addAttribute("allTopic", topicService.allTopic());
        return "topics";
    }

    @GetMapping("/topic/{id}")
     public String topic(@PathVariable Long id,Model model){
        model.addAttribute("topic",topicService.getTopic(id));
        model.addAttribute("topicMessage",messageService.topicMessage(id));
        return "topic";
    }
    @GetMapping("/addTopic")
    public String addTopic(){

        return "addTopic";
    }

    @PostMapping("addTopic")
    public String addTopic(@ModelAttribute("topicForm") @Valid Topic topic, @AuthenticationPrincipal User user, Model model){

        return "redirect:/topic/"+topicService.addTopic(topic,user).getId();
    }

}
