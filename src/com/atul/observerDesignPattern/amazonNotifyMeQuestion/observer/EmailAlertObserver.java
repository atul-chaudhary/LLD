package com.atul.observerDesignPattern.amazonNotifyMeQuestion.observer;

import com.atul.observerDesignPattern.amazonNotifyMeQuestion.observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public EmailAlertObserver(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "buy the fuck up");
    }

    private void sendEmail(String emailId, String msg){
        System.out.println("mail sent to : " + emailId+ " with msg " + msg);
    }
}
