package com.example.chikara.factorypattern.CreationalPattern.BuilderPattern;

/**
 * Created by chikara on 2/13/18.
 */

public class MotoPhoneFectory implements PhoneFectory {

    private PhoneEntity entity;

    public MotoPhoneFectory(PhoneEntity entity) {
        this.entity = entity;
    }

    @Override
    public PhoneRequirement getPhone() {
        return new MotoPhoneClass(entity);
    }

}
