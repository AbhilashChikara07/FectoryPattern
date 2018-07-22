package com.example.chikara.factorypattern.CreationalPattern.FectoryDesignPattern;

public class SwiftCarClass extends CarRequirementInterface {

    private String mCarTyre;
    private String mCarLogo;

    SwiftCarClass(String mCarTyre, String mCarLogo) {
        this.mCarTyre = mCarTyre;
        this.mCarLogo = mCarLogo;
    }

    @Override
    String getTyre() {
        return mCarTyre;
    }

    @Override
    String getLogo() {
        return mCarLogo;
    }

}
