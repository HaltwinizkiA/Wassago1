package com.boots.service;

import com.boots.entity.Message;
import com.boots.entity.User;
import com.boots.repository.MessageRepository;
import com.boots.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;
    @Autowired
    TopicRepository topicRepository;
    @PersistenceContext
    private EntityManager em;

    public List<Message> topicMessage(Long id) {
        return em.createQuery
                ("select message from Message message left join fetch message.topic topic where topic.id= :id", Message.class)
                .setParameter("id", id).getResultList();
    }


    public Message addMessage(Message message, User user, Long topicId) {
        message.setAuthor(user);
        message.setCreateDate(new Date());
        message.setTopic(topicRepository.getOne(topicId));
        return messageRepository.save(message);
    }
}
