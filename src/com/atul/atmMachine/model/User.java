package com.atul.atmMachine.model;

public class User {
    int userId;
    String name;
    Card userCard;
    BankAccount userAccount;

    public User(int userId, String name, Card userCard, BankAccount userAccount) {
        this.userId = userId;
        this.name = name;
        this.userCard = userCard;
        this.userAccount = userAccount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getUserCard() {
        return userCard;
    }

    public void setUserCard(Card userCard) {
        this.userCard = userCard;
    }

    public BankAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(BankAccount userAccount) {
        this.userAccount = userAccount;
    }
}
