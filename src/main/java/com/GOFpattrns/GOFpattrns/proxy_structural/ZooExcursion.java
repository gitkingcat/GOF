package com.GOFpattrns.GOFpattrns.proxy_structural;

import com.GOFpattrns.GOFpattrns.decorator_creational.Human;
import com.GOFpattrns.GOFpattrns.singleton_creational.RepositoryImpl;

public class ZooExcursion implements Excursion{

    public void runExcursion() {
        initializeZoo();
        System.out.println("Starting Excursion");
        for (Human human: RepositoryImpl.getInstance()) {
            System.out.println(human.enjoyLive());
        }
        System.out.println("Excursion finished");
    }

    public void initializeZoo(){
        System.out.println("Initializing Zoo");

    }

}
