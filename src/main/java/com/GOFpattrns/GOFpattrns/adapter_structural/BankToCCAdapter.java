package com.GOFpattrns.GOFpattrns.adapter_structural;

public class BankToCCAdapter extends BankAccount implements CreditCard {


    @Override
    public void putMoneyToATM(Double amount) {
        putMoney(amount);
    }

    @Override
    public Double getCCBalance() {
        return getBalance();
    }
}
