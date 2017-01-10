package com.example.aop;
import   org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class AspectExample {

    @Before("execution(* com.example.MyMessageService.getMessage())")
    public void getMessageAdvice(){
        System.out.println("********Executing Advice on getMessage()");
    }
}
