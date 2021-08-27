package com.GOFpattrns.GOFpattrns.adapter_structural;

public class BankAccount {

    private static Double money;

    public BankAccount() {
        if (money==null){
            money= 0.0;}
    }

    public void putMoney(Double amount) {
    BankAccount bank = new BankAccount();
    money+=amount;
    }

    public Double getBalance() {
    BankAccount bank = new BankAccount();
    return money;
    }
}
