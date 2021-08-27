package com.GOFpattrns.GOFpattrns.singleton_creational;

import com.GOFpattrns.GOFpattrns.decorator_creational.Human;

import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl implements Repository{

    private static List<Human> tourists;


    private RepositoryImpl() {
        //Objects added to Database
    }

    public static ArrayList<Human> getInstance() {
        if (tourists == null){
        tourists = new ArrayList<>();}
        return (ArrayList<Human>) tourists;
    }
    public static void clear(){
        tourists.clear();
    }
}
