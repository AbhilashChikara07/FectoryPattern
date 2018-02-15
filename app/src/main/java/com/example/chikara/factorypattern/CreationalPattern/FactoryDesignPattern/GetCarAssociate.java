package com.example.chikara.factorypattern.CreationalPattern.FactoryDesignPattern;

/**
 * Created by chikara on 2/12/18.
 */

public class GetCarAssociate {

    public CarRequirement getCarObj(String type,
                                    String tyreName,
                                    String staringName,
                                    String playerName) {
        if (type.equalsIgnoreCase("Maruti")) {
            return new MahindraCarClass(tyreName, staringName, playerName);
        } else if (type.equalsIgnoreCase("Skoda")) {
            return new SkodaClassObj(tyreName, staringName, playerName);
        }
        return null;
    }
}

