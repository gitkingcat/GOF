package com.GOFpattrns.GOFpattrns.state_behavioral;

import com.GOFpattrns.GOFpattrns.proxy_structural.Excursion;
import com.GOFpattrns.GOFpattrns.proxy_structural.ExcursionProvider;

public class RunExcursion implements Business{

    @Override
    public void makeBusiness() {
        Excursion excursion = new ExcursionProvider();
        excursion.runExcursion();
    }
}
