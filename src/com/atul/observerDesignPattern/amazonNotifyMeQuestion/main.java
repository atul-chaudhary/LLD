package com.atul.observerDesignPattern.amazonNotifyMeQuestion;

import com.atul.observerDesignPattern.amazonNotifyMeQuestion.observable.IphoneObservableImpl;
import com.atul.observerDesignPattern.amazonNotifyMeQuestion.observable.StockObservable;
import com.atul.observerDesignPattern.amazonNotifyMeQuestion.observer.EmailAlertObserver;
import com.atul.observerDesignPattern.amazonNotifyMeQuestion.observer.NotificationAlertObserver;

public class main {

    //this question has been asked in walmart
    //this question is regarding the implementation functionality of amazon's notify me funct
    //when the product is again in stock send message to all the customer who have subscribed ot it.
    public static void main(String[] args) {
        StockObservable observable = new IphoneObservableImpl();

        //here we are setting the relevant information along
        // with we are telling the observer that which observable i'm currently looking for
        //that's why we are passing the observable
        NotificationAlertObserver observer1 = new EmailAlertObserver("xyx@gamil.com", observable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("fck@gamil.com", observable);
        NotificationAlertObserver observer3 = new EmailAlertObserver("honey@gami.com", observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        observable.setStockCount(10);
    }

}
