package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        for (String s : ctx.getBeanDefinitionNames()) {
            System.out.println(s);
        }
        DummyComponent messageService = (DummyComponent) ctx.getBean("dummyComponent");

        messageService.doAction();
    }

}
