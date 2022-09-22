package com.boots.controller;

import com.boots.entity.News;
import com.boots.entity.User;
import com.boots.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping("/news")
    public String newsList(Model model) {
        model.addAttribute("allNews", newsService.allNews());

        return "news";
    }

    @GetMapping("/addNews")
    public String addNews(Model model) {

        return "addNews";
    }

    @PostMapping("/addNews")
    public String addNews(@ModelAttribute("newsForm") @Valid News news, @AuthenticationPrincipal User user, Model model) {
        newsService.addNews(news, user);
        return "redirect:/news";
    }

}
