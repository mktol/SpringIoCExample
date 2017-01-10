package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("myMessageService")
public class MyMessageService implements MessageService{

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String getMessage() {
        System.out.println("before get message");
        return "--default message--";
    }
}
