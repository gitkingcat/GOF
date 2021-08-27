package com.GOFpattrns.GOFpattrns.decorator_creational;

public class Adult extends HumanDecorator {
    public Adult(Human human) {
        super(human);
    }


    @Override
    public String enjoyLive() {
        return super.enjoyLive()+" "+getSalary();
    }


    public String getSalary(){return " Dring Beer.";}
}
