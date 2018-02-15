package com.example.chikara.factorypattern.CreationalPattern.BuilderPattern;

/**
 * Created by chikara on 2/13/18.
 */

public class NokiaPhoneFectory implements PhoneFectory {
    private PhoneEntity entity;

    NokiaPhoneFectory(PhoneEntity entity) {
        this.entity = entity;
    }

    @Override
    public PhoneRequirement getPhone() {
        return new NokiyaPhoneClass(entity);
    }

}
