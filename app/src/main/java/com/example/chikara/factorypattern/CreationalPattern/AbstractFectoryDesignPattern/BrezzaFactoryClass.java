package com.example.chikara.factorypattern.CreationalPattern.AbstractFectoryDesignPattern;

public class BrezzaFactoryClass implements FactoryClassInterface {

    private String mTyreName;
    private String mCarLogo;

    BrezzaFactoryClass(String mTyreName, String mCarLogo) {
        this.mTyreName = mTyreName;
        this.mCarLogo = mCarLogo;
    }

    @Override
    public CarRequirementClass getCarClassObj() {
        return new BrezzaCarClass(mTyreName, mCarLogo);
    }

}
