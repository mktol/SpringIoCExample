package com.di.example;


public class Character {
    private String name;
    private Action action;

    public Character(Action action) {
        this.action = action;
    }

    public void doAction(){
        System.out.println("doing action");
        action.doing();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
