package com.example.chikara.factorypattern.CreationalPattern.AbstractFectoryDesignPattern;

public class BrezzaFectoryClass implements FactoryClassInterface {

    private String mTyreName;
    private String mCarLogo;

    BrezzaFectoryClass(String mTyreName, String mCarLogo) {
        this.mTyreName = mTyreName;
        this.mCarLogo = mCarLogo;
    }

    @Override
    public CarRequirementClass getCarClassObj() {
        return new BrezzaCarClass(mTyreName, mCarLogo);
    }

}
