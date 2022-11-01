package com.codecool.car_race.vehicles;

import com.codecool.car_race.GenerateRandom;
import com.codecool.car_race.Race;

public class Truck extends Vehicle{

    private boolean isBroken;
    private int brokenLaps = 0;

    public Truck() {
        this.name = String.valueOf(GenerateRandom.generateRandom(0, 1000));
    }

    @Override
    public void prepareForLap(Race race) {
        if (!isBroken) {isBrokeDown();}
        if (isBroken) {
            actualSpeed = 0;
            brokenLaps += 1;
        } else {
            actualSpeed = 100;
        }
        repairTruck();
    }

    @Override
    public void moveForAnHour() {
        distanceTraveled += actualSpeed;
    }

    public boolean isBrokeDown() {
        int chance = GenerateRandom.generateRandom(0, 100);
        isBroken = chance < 5;
        return isBroken;
    }

    public void repairTruck() {
        if (brokenLaps == 2) {
            brokenLaps = 0;
            isBroken = false;
        }
    }
}
