package com.example.chikara.factorypattern.CreationalPattern.BuilderPattern;

/**
 * Created by chikara on 2/13/18.
 */

public class AssociatePhone {
    public static PhoneRequirement getPhoneType(PhoneFectory phoneFectory) {
        return phoneFectory.getPhone();
    }
}
