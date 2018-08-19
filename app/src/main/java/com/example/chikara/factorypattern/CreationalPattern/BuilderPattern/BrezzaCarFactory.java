package com.example.chikara.factorypattern.CreationalPattern.BuilderPattern;

public class BrezzaCarFactory extends CarRequirement {

    private BuilderEntity entity;

    public BrezzaCarFactory(BuilderEntity entity) {
        this.entity = entity;
    }

    @Override
    String getSeatBelt() {
        return entity.carSeatBalt;
    }

    @Override
    String getStaring() {
        return entity.carStaring;
    }

    @Override
    String getBreak() {
        return entity.carBreak;
    }

}
