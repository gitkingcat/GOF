package com.GOFpattrns.GOFpattrns.decorator_creational;

public class Senior extends HumanDecorator{

    public Senior(Human human) {
        super(human);
    }

    @Override
    public String enjoyLive() {
        return super.enjoyLive()+" "+ miningPension();
    }

    private String miningPension(){
        return " Ride bicycle.";
    }
}
