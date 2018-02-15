package com.example.chikara.factorypattern.CreationalPattern.BuilderPattern;

/**
 * Created by chikara on 2/13/18.
 */

public class NokiyaPhoneClass extends PhoneRequirement {
    PhoneEntity entity;

    NokiyaPhoneClass(PhoneEntity entity) {
        this.entity = entity;
    }

    @Override
    String getBattery() {
        return this.entity.getBattery();
    }

    @Override
    String getDisplay() {
        return this.entity.getDisplay();
    }
}
