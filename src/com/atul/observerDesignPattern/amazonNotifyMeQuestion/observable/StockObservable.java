package com.atul.observerDesignPattern.amazonNotifyMeQuestion.observable;

import com.atul.observerDesignPattern.amazonNotifyMeQuestion.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifyCustomers();
    void setStockCount(int count);
    int getStockCount();
}
