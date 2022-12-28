package com.atul.observerDesignPattern.tempStationQuestion;

import com.atul.observerDesignPattern.tempStationQuestion.observable.WatchTowerObservable;
import com.atul.observerDesignPattern.tempStationQuestion.observer.MobileDisplayObserver;

public class main {
    //this is question is related

    //Implement Temperature Station
    // there is a watch tower which is provides the information of data [temps]
    // and there are multiple display's which show this information provided by the watch tower
    //as soon the information changes it should be reflected into all the displays i.e mobile display and tablet display
    public static void main(String[] args) {


        WatchTowerObservable wsInterf = new WatchTowerObservable();
        wsInterf.add(new MobileDisplayObserver(wsInterf));
        //wsInterf.add(new TabletDisplayObserver(wsInterf));
        wsInterf.setData(10);
    }
}
