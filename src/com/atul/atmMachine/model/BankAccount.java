package com.atul.atmMachine.model;

public class BankAccount {
    String bankName;
    int balance;

    public BankAccount(String bankName, int balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
