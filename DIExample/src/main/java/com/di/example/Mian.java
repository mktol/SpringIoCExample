package com.di.example;

public class Mian {
    public static void main(String[] args) {

        Action writing = new WriteMessageAction();
        Action playing = new PlayTennisAction();
        Character character = new Character(writing);
        character.doAction();
        System.out.println("....");
        character.setAction(playing);
        character.doAction();
    }
}
