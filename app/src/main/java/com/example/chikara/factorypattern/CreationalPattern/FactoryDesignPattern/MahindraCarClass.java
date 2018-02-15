package com.example.chikara.factorypattern.CreationalPattern.FactoryDesignPattern;

/**
 * Created by chikara on 2/12/18.
 */

public class MahindraCarClass extends CarRequirement {

    String tyreName;
    String staringName;
    String playerName;

    MahindraCarClass(String tyreName, String staringName, String playerName) {
        this.tyreName = tyreName;
        this.staringName = staringName;
        this.playerName = playerName;
    }

    @Override
    public String getTyre() {
        return tyreName;
    }

    @Override
    public String getStaring() {
        return staringName;
    }

    @Override
    public String getAudioPlayer() {
        return playerName;
    }

}
