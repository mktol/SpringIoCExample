package com.example.postConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
@Scope("prototype")
public class Item {
    private int age;
    private String name;

    @PostConstruct
    private void fillRows(){
        age = 34+new Random().nextInt(10);
        name =  "Black Jack";
        System.out.println("-----Rows are initialized. ---");
    }

    @PreDestroy
    private void destroyConnection(){
        System.out.println(" preDestroy ");
        System.out.println("-- disconnect --");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
