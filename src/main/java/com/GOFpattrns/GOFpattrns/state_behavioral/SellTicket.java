package com.GOFpattrns.GOFpattrns.state_behavioral;

import com.GOFpattrns.GOFpattrns.adapter_structural.BankAccount;
import com.GOFpattrns.GOFpattrns.adapter_structural.BankToCCAdapter;
import com.GOFpattrns.GOFpattrns.adapter_structural.CreditCard;
import com.GOFpattrns.GOFpattrns.singleton_creational.RepositoryImpl;

import java.util.Random;

public class SellTicket implements Business{

    @Override
    public void makeBusiness() {
        int touristsInGroup = RepositoryImpl.getInstance().size();
        if (RepositoryImpl.getInstance().size()>=10){
            System.out.println("Tourists in the group: "+ touristsInGroup);
            Random random = new Random();
            for (int i=0;i<touristsInGroup;i++){
                int lucky = random.nextInt(3);
                if (lucky==1){
                    System.out.println("Ticket sold with discount, 7$ earned.");
                    CreditCard creditCard = new BankToCCAdapter();
                    creditCard.putMoneyToATM(7.0);
                }else {
                    System.out.println("Ticket sold for regular price, 10$ earned");
                    BankAccount bankAccount = new BankAccount();
                    bankAccount.putMoney(10.00);
                }
            }
        }
        System.out.println("Money on bank account:  " + new BankAccount().getBalance());
    }
}
