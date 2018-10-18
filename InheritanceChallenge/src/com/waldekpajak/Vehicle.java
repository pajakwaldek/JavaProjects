package com.waldekpajak;

public class Vehicle {
    private String name;
    private String size;

    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    //Steering function
    public void steer(int direction) {
        this.currentDirection +=direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    //Moving function
    public void move(int speed, int direction) {
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentSpeed + " in direction " + currentDirection);
    }


    //Getters
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentSpeed = 0;
    }
}
