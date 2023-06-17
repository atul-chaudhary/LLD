package com.atul.atmMachine.service;

import com.atul.atmMachine.model.Card;

public class CashWithDrawState extends AtmState{
    @Override
    public void cashWithDraw(Atm atm, Card userCard, int amount) {
        if(userCard.getUserAccount().getBalance() < amount){
            System.out.println("Incorrect amount");
            exit(atm);
        }else {
            int existingBalance = userCard.getUserAccount().getBalance();
            userCard.getUserAccount().setBalance(existingBalance-amount);



        }
    }

    public void exit(Atm atm) {
        System.out.println("please collect your Card");
        atm.setAtmState(new IdleState());
        System.out.println("exit happen");
    }
}
