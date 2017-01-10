package com.example;

import com.example.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "messageService")
public class MessageService {
    @Autowired
    private Message message;
    public void showMessage(){
        System.out.println(message);
    }
}
