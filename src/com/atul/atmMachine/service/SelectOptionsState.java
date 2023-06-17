package com.atul.atmMachine.service;

import com.atul.atmMachine.model.AtmOptions;
import com.atul.atmMachine.model.Card;

public class SelectOptionsState extends AtmState {

    @Override
    public void selectOptions(Atm atm, Card userCard, AtmOptions atmOptions) {
        switch (atmOptions) {
            case CASH_WITHDRAW:
                atm.setAtmState(new CashWithDrawState());
                break;
            case CHECK_BALANCE:
                atm.setAtmState(new CheckBalanceState());
                break;
            case EXIT:
                exit(atm);
                break;
        }
    }

    public void exit(Atm atm) {
        System.out.println("please collect your Card");
        atm.setAtmState(new IdleState());
        System.out.println("exit happen");
    }
}
