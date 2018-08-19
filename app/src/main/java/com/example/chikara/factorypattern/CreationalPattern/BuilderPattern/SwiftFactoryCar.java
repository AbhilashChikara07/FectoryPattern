package com.example.chikara.factorypattern.CreationalPattern.BuilderPattern;

public class SwiftFactoryCar extends CarRequirement {

    private BuilderEntity entity;

    SwiftFactoryCar(BuilderEntity entity) {
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
