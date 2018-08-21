package com.example.chikara.factorypattern.BehaviourPattern;

public interface ObserableInterface {

    void addObserver(ObserverInterface mObserverInterface);

    void removeObserver(ObserverInterface mObserverInterface);

    void notifyObserver();

}
