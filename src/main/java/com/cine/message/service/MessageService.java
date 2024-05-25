package com.cine.message.service;

import com.cine.message.model.Message;
import com.cine.message.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    public Message getMessageById(Long id){
        return messageRepository.findById(id).orElse(null);
    }
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}
