package com.GOFpattrns.GOFpattrns.state_behavioral;

import com.GOFpattrns.GOFpattrns.decorator_creational.Adult;
import com.GOFpattrns.GOFpattrns.decorator_creational.Children;
import com.GOFpattrns.GOFpattrns.decorator_creational.Senior;
import com.GOFpattrns.GOFpattrns.adapter_structural.BankAccount;
import com.GOFpattrns.GOFpattrns.singleton_creational.RepositoryImpl;

import java.util.Random;

public class Promote implements Business{
    @Override
    public void makeBusiness() {
        System.out.println("Advertising Excursions.");
        Random random = new Random();
        int numberOfTouristGenerated = random.nextInt(5);
        int promoBudget = random.nextInt(4)+1;

        for (int i =0; i<numberOfTouristGenerated;i++){
            int tmp = random.nextInt(3);
            if (tmp==1){
                RepositoryImpl.getInstance().add(new Children());
            }else if(tmp==2){
                RepositoryImpl.getInstance().add(new Adult(new Children()));
            }else {
                RepositoryImpl.getInstance().add(new Senior(new Adult(new Children())));
            }
        }
        System.out.println("Totally: "+numberOfTouristGenerated+" new people attracted.");
        new BankAccount().putMoney((double) -promoBudget);
        System.out.println("Money spend on promo: "+promoBudget);
    }
}
