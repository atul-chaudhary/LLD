package com.atul.atmMachine.service;

import com.atul.atmMachine.model.Card;

public class IdleState extends AtmState {
    @Override
    public void insertCard(Atm atm, Card userCard) {
        System.out.println("Card is inserted");
        atm.setAtmState(new CardState());
    }
}
