package com.atul.atmMachine.service;

import com.atul.atmMachine.model.AtmOptions;
import com.atul.atmMachine.model.BankAccount;
import com.atul.atmMachine.model.Card;
import com.atul.atmMachine.model.User;

public class AtmRoom {
    User user;
    Atm atm;

    public static void main(String[] args) {

        AtmRoom atmRoom = new AtmRoom();
        atmRoom.setAtm(atmRoom.createAtm());
        atmRoom.setUser(atmRoom.createUser());

        //insert card into atm
        //atmRoom.getAtm().get.insertAtmCard(atmRoom.getUser(), atmRoom.getUser().getUserCard());
        //atmRoom.getAtm().
        atmRoom.getAtm().getAtmState().insertCard(atmRoom.getAtm(), atmRoom.getUser().getUserCard());
        atmRoom.getAtm().getAtmState().authenticateUserAtmCard(atmRoom.getAtm(), atmRoom.getUser().getUserCard(), "123456789");
        atmRoom.getAtm().getAtmState().selectOptions(atmRoom.getAtm(), atmRoom.getUser().getUserCard(), AtmOptions.CASH_WITHDRAW);

    }


    private User createUser() {
        return new User(1, "Atul", createUserCard(), createBankAccount());
    }

    private Card createUserCard() {
        return new Card(1, "123 456 789", "123", null, "123456789", createBankAccount());
    }

    private Atm createAtm() {
        Atm atm = new Atm("Pnb Bank", 3500, 1, 2, 5);
        atm.setAtmState(atm);
        return atm;
    }

    private BankAccount createBankAccount() {
        return new BankAccount("PNB Bank", 3000);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Atm getAtm() {
        return atm;
    }

    public void setAtm(Atm atm) {
        this.atm = atm;
    }
}
