package com.boots.service;

import com.boots.entity.Topic;
import com.boots.entity.User;
import com.boots.repository.NewsRepository;
import com.boots.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    TopicRepository topicRepository;
    public List<Topic> allTopic() {
       return topicRepository.findAll();
    }
    public Topic getTopic(Long id){
        Optional<Topic> topicFromDb = topicRepository.findById(id);
        return topicFromDb.orElse(new Topic());
    }
}
