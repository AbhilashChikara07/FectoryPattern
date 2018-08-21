package com.example.chikara.factorypattern.BehaviourPattern;

import java.util.ArrayList;

public class RedDressClass implements ObserableInterface {

    ArrayList<ObserverInterface> mObserverList = new ArrayList<>();
    boolean inStock;


    RedDressClass(ObserverInterface mObserverInterface,
                  boolean mInStock) {
        this.inStock = mInStock;
        mObserverList.add(mObserverInterface);
    }

    void setObserverInterface(ObserverInterface mObserverInterface) {
        mObserverList.add(mObserverInterface);
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }


    @Override
    public void addObserver(ObserverInterface mObserverInterface) {
        mObserverList.add(mObserverInterface);
    }

    @Override
    public void removeObserver(ObserverInterface mObserverInterface) {
        mObserverList.remove(mObserverInterface);
    }

    @Override
    public void notifyObserver() {
        for (ObserverInterface mObserverInterface : mObserverList) {
            mObserverInterface.update();
        }
    }
}
