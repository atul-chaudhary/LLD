package com.atul.observerDesignPattern.tempStationQuestion.observable;

import com.atul.observerDesignPattern.tempStationQuestion.observer.DisplayObserverInterface;

public interface WatchTowerObservableInterface {
    void add(DisplayObserverInterface obj);

    void remove(DisplayObserverInterface obj);

    void notifyObjs();

    void setData(int temp);
}
