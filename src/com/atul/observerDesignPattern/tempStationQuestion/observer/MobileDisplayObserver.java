package com.atul.observerDesignPattern.tempStationQuestion.observer;

import com.atul.observerDesignPattern.tempStationQuestion.observable.WatchTowerObservable;

public class MobileDisplayObserver implements DisplayObserverInterface {

    WatchTowerObservable obj;

    public MobileDisplayObserver(WatchTowerObservable obj) {
        this.obj = obj;
    }

    //this is optimised way to doing it
    //in this way we put the has a relationship with
    @Override
    public void update() {
        if(obj != null){
            WatchTowerObservable watchTowerObservable = (WatchTowerObservable) obj;
            System.out.println(watchTowerObservable.getData()+ "data got updated");
        }
    }

}
