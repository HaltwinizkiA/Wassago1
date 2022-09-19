package com.boots.service;

import com.boots.entity.News;
import com.boots.entity.User;
import com.boots.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class NewsService {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    NewsRepository newsRepository;

    public List<News> allNews(){
        System.out.println("11111111111111111122222222");
        List<News> newsList=newsRepository.findAll();
        Collections.reverse(newsList);
        return newsList;
    }
    public boolean addNews(News news, User user){
        news.setDate(new Date());
        news.setUser(user);

        newsRepository.save(news);
        return true;
    }

}
