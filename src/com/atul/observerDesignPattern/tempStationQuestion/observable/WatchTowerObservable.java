package com.atul.observerDesignPattern.tempStationQuestion.observable;

import com.atul.observerDesignPattern.tempStationQuestion.observer.DisplayObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class WatchTowerObservable implements WatchTowerObservableInterface {
    List<DisplayObserverInterface> displayObserverList = new ArrayList<>();
    int data;

    public int getData() {
        return data;
    }

    @Override
    public void add(DisplayObserverInterface obj) {
        displayObserverList.add(obj);
    }

    @Override
    public void remove(DisplayObserverInterface obj) {
        displayObserverList.remove(obj);
    }

    @Override
    public void notifyObjs() {
        for (DisplayObserverInterface it : displayObserverList) {
            it.update();
        }
    }

    @Override
    public void setData(int temp) {
        this.data = temp;
        notifyObjs();
    }
}
