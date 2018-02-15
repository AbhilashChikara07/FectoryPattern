package com.example.chikara.factorypattern.CreationalPattern.FactoryDesignPattern;

/**
 * Created by chikara on 2/12/18.
 */

public class SkodaClassObj extends CarRequirement {

    private String tyreName;
    private String staringName;
    private String playerName;

    public SkodaClassObj(String tyreName, String staringName, String playerName) {
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
