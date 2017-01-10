package com.example;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public String sayHello(String person){
        return "Hello "+person;
    }

    public int sumInt(int a, int b){
        return a+b;
    }

    public int divisionZeroo(int number){
        return number/0;
    }
}
