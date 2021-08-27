package com.GOFpattrns.GOFpattrns.proxy_structural;

import com.GOFpattrns.GOFpattrns.singleton_creational.RepositoryImpl;

public class ExcursionProvider implements Excursion{
    private ZooExcursion zooExcursion;
    private final static Integer TOURIST_GROUP_CAPACITY = 10;
    public void runExcursion() {


        if (checkTouristsAreReady()){
            zooExcursion= new ZooExcursion();
            zooExcursion.runExcursion();
            RepositoryImpl.clear();
        } else if(!checkTouristsAreReady() ){
            System.out.println("Excursion is not ready. Not enought tourists.");
        }
    }

    private boolean checkTouristsAreReady(){
        return RepositoryImpl.getInstance().size() >= TOURIST_GROUP_CAPACITY;
    }

}
