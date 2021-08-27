package com.GOFpattrns.GOFpattrns.state_behavioral;

public class Businessman {
    Business business;

    public void setBusiness(Business business) {
        this.business = business;
    }

    public void changeBusiness(){
        if (business instanceof RunExcursion){
            setBusiness(new Promote());
        }else if (business instanceof Promote){
            setBusiness(new SellTicket());
        }else if (business instanceof SellTicket){
            setBusiness(new RunExcursion());
        }
    }

    public void runBusiness(){
        changeBusiness();
        business.makeBusiness();
    }
}
