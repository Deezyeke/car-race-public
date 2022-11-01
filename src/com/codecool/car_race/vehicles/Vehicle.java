package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {

    protected String name;
    protected int actualSpeed;
    protected int distanceTraveled;

    public abstract void prepareForLap(Race race);
    public abstract void moveForAnHour();

    @Override
    public String toString() {
        return "{" +
                "distance travelled: " +
                distanceTraveled +
                ", " +
                "type: " +
                getClass().getSimpleName() +
                ", " +
                "name: " +
                name +
                "}";
    }
}
