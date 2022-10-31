package com.codecool.car_race.vehicles;

public abstract class Vehicle {

    protected String name;
    protected int actualSpeed;
    protected int distanceTraveled;

    public abstract void prepareForLap(boolean isDisadvantage);
    public abstract void moveForAnHour();
}
