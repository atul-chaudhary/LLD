package com.atul.atmMachine.service;

import com.atul.atmMachine.model.AtmOptions;
import com.atul.atmMachine.model.Card;

public abstract class AtmState {

    public void insertCard(Atm atm, Card userCard) {
        System.out.println("OOPS Something went wrong");
    }

    public void authenticateUserAtmCard(Atm atm, Card userCard, String pin){
        System.out.println("OOPS Something went wrong");
    }

    public void selectOptions(Atm atm, Card userCard, AtmOptions atmOptions) {
        System.out.println("OOPS Something went wrong");
    }

    public void cashWithDraw(Atm atm, Card userCard, int amount) {
        System.out.println("OOPS Something went wrong");
    }

    public void checkBalance(Atm atm, Card userCard){
        System.out.println("OOPS Something went wrong");
    }

    public void exit(Atm atm, Card userCard){
        System.out.println("OOPS Something went wrong");
    }

}
