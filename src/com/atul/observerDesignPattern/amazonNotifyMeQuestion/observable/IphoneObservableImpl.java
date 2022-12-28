package com.atul.observerDesignPattern.amazonNotifyMeQuestion.observable;

import com.atul.observerDesignPattern.amazonNotifyMeQuestion.observer.NotificationAlertObserver;
import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;


    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyCustomers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int count) {
        this.stockCount = count;
        notifyCustomers();
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
