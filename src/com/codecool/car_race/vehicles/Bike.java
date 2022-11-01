package com.codecool.car_race.vehicles;

import com.codecool.car_race.GenerateRandom;
import com.codecool.car_race.Race;

public class Bike extends Vehicle{

    private static int bikeCount = 1;
    private final static int NORMAL_SPEED = 100;

    public Bike() {
        this.name = "Motorcycle " + bikeCount++;
    }

    @Override
    public void prepareForLap(Race race) {
        actualSpeed = NORMAL_SPEED;
        if (race.isRaining()) {
            actualSpeed -= GenerateRandom.generateRandom(5, 50);
        }
    }

    @Override
    public void moveForAnHour() {
        distanceTravelled += actualSpeed;
    }
}
