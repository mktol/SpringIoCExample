package com.example;

import com.example.transaction.TransactionExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "messageService")
public class MessageService {
    @Autowired
    private Message message;

    @Autowired
    @Qualifier(value = "generalQuestion")
    private Message generalQuestion;

    private TransactionExampleService transactionExampleService;

    @Autowired
    @Qualifier(value = "generalQuestion")
    private Message generalQuestion2;

    @Autowired
    public void setTransactionExampleService(TransactionExampleService transactionExampleService) {
        this.transactionExampleService = transactionExampleService;
    }

    public void writeData(String data){
        transactionExampleService.writeDataEmulation(data);
    }

    public void showMessage(){
        System.out.println(message);
        System.out.println("---------------------");
        System.out.println(generalQuestion);
        System.out.println(generalQuestion2);
    }


}
