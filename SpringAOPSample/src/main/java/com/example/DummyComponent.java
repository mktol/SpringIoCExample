package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by mtol on 10.01.2017.
 */
@Component
public class DummyComponent {
    @Autowired
    @Qualifier("myMessageService")
    private MessageService messageService;

    public void doAction(){
        messageService.getMessage();
    }
}
