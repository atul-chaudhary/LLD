package com.atul.atmMachine.service;

import com.atul.atmMachine.model.Card;
import com.atul.atmMachine.model.User;

public class Atm {
    private String AtmName;
    private int balance;
    private int numberOf2kNotes;
    private int numberOf500Notes;
    private int numberOf100Notes;

    AtmState atmState;

    public Atm(String atmName, int balance, int numberOf2kNotes, int numberOf500Notes, int numberOf100Notes) {
        AtmName = atmName;
        this.balance = balance;
        this.numberOf2kNotes = numberOf2kNotes;
        this.numberOf500Notes = numberOf500Notes;
        this.numberOf100Notes = numberOf100Notes;
    }

    public void insertAtmCard(User user, Card card) {

    }

    public void atmStatus() {
        System.out.println("No. of 2000 Notes in atm " + numberOf2kNotes);
        System.out.println("No. of 500 Notes in atm " + numberOf500Notes);
        System.out.println("No. of 100 Notes in atm " + numberOf100Notes);
    }

    public void setAtmState(Atm atm) {
        atm.setAtmState(new IdleState());
    }

    public String getAtmName() {
        return AtmName;
    }

    public void setAtmName(String atmName) {
        AtmName = atmName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getNumberOf2kNotes() {
        return numberOf2kNotes;
    }

    public void setNumberOf2kNotes(int numberOf2kNotes) {
        this.numberOf2kNotes = numberOf2kNotes;
    }

    public int getNumberOf500Notes() {
        return numberOf500Notes;
    }

    public void setNumberOf500Notes(int numberOf500Notes) {
        this.numberOf500Notes = numberOf500Notes;
    }

    public int getNumberOf100Notes() {
        return numberOf100Notes;
    }

    public void setNumberOf100Notes(int numberOf100Notes) {
        this.numberOf100Notes = numberOf100Notes;
    }

    public AtmState getAtmState() {
        return atmState;
    }

    public void setAtmState(AtmState atmState) {
        this.atmState = atmState;
    }


}
