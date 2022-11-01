package com.codecool.car_race.vehicles;

import com.codecool.car_race.GenerateRandom;
import com.codecool.car_race.Race;

public class Truck extends Vehicle{

    private boolean isBroken;
    private int brokenLapsCount = 0;
    private final static int NORMAL_SPEED = 100;

    public Truck() {
        this.name = String.valueOf(GenerateRandom.generateRandom(0, 1000));
    }

    @Override
    public void prepareForLap(Race race) {
        if (!isBroken) {isBrokeDown();}
        if (isBroken) {
            actualSpeed = 0;
            brokenLapsCount += 1;
        } else {
            actualSpeed = NORMAL_SPEED;
        }
        repairTruck();
    }

    @Override
    public void moveForAnHour() {
        distanceTravelled += actualSpeed;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void isBrokeDown() {
        int chance = GenerateRandom.generateRandom(0, 100);
        isBroken = chance < 5;
    }

    public void repairTruck() {
        if (brokenLapsCount >= 2) {
            brokenLapsCount = 0;
            isBroken = false;
        }
    }
}
