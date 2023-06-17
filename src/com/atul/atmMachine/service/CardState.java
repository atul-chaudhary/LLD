package com.atul.atmMachine.service;

import com.atul.atmMachine.model.Card;


public class CardState extends AtmState {
    @Override
    public void authenticateUserAtmCard(Atm atm, Card userCard, String pin) {
        if (userCard.getPin().equals(pin)) {
            System.out.println("Please select any options");
            atm.setAtmState(new SelectOptionsState());
        } else {
            System.out.println("Incorrect Pin");
            exit(atm);
        }
    }

    public void exit(Atm atm) {
        System.out.println("please collect your Card");
        atm.setAtmState(new IdleState());
        System.out.println("exit happen");
    }
}
