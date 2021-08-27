package com.GOFpattrns.GOFpattrns.decorator_creational;

public class HumanDecorator implements Human{

    Human human;

    public HumanDecorator(Human human) {
        this.human = human;
    }

    public String enjoyLive() {
        return human.enjoyLive();
    }
}
