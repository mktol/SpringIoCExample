package com.example.transaction;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TransactionExampleService {


    @Transactional
    public void writeDataEmulation(String data){

        writeToMySql(data);
        writeToPostgres(data);
    }

    private void writeToMySql(String data) {
        System.out.println("connect to mysql db");
        System.out.println("write data: " + data+ ", to mySql.");
        System.out.println("disconnect");
    }
    private void writeToPostgres(String data) {
        System.out.println("connect to Postgres db");
        System.out.println("write data: "+data+ ", to  Postgres");
        System.out.println("disconnect");
    }
}
