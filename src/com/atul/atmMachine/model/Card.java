package com.atul.atmMachine.model;

public class Card {
    int userId;
    String cardNumber;
    String ccvNumber;
    String expiryDate;
    String pin;
    BankAccount userAccount;


    public Card(int userId, String cardNumber, String ccvNumber, String expiryDate, BankAccount userAccount) {
        this.userId = userId;
        this.cardNumber = cardNumber;
        this.ccvNumber = ccvNumber;
        this.expiryDate = expiryDate;
        this.userAccount = userAccount;
    }

    public Card(int userId, String cardNumber, String ccvNumber, String expiryDate, String pin, BankAccount userAccount) {
        this.userId = userId;
        this.cardNumber = cardNumber;
        this.ccvNumber = ccvNumber;
        this.expiryDate = expiryDate;
        this.pin = pin;
        this.userAccount = userAccount;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCcvNumber() {
        return ccvNumber;
    }

    public void setCcvNumber(String ccvNumber) {
        this.ccvNumber = ccvNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public BankAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(BankAccount userAccount) {
        this.userAccount = userAccount;
    }
}
