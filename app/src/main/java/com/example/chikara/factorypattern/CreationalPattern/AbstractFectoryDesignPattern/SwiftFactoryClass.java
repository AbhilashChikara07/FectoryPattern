package com.example.chikara.factorypattern.CreationalPattern.AbstractFectoryDesignPattern;

public class SwiftFactoryClass implements FactoryClassInterface {

    private String mTyreName;
    private String mCarLogo;

    SwiftFactoryClass(String mTyreName, String mCarLogo) {
        this.mTyreName = mTyreName;
        this.mCarLogo = mCarLogo;
    }

    @Override
    public CarRequirementClass getCarClassObj() {
        return new SwiftCarClass(mTyreName, mCarLogo);
    }

}
