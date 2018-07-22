package com.example.chikara.factorypattern.CreationalPattern.AbstractFectoryDesignPattern;

public class BrezzaCarClass extends CarRequirementClass {

    private String mTyreName;
    private String mCarLogo;

    BrezzaCarClass(String mTyreName, String mCarLogo) {
        this.mTyreName = mTyreName;
        this.mCarLogo = mCarLogo;
    }

    @Override
    String getTyreName() {
        return mTyreName;
    }

    @Override
    String getCarLogo() {
        return mCarLogo;
    }

}
