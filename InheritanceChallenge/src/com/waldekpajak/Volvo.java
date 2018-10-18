package com.waldekpajak;

public class Volvo extends Car {
    private int roadInsuranceNonths;

    public Volvo(int roadInsuranceNonths) {
        super("Volvo V60", "2,5 V6", 5, 5, 6, false);
        this.roadInsuranceNonths = roadInsuranceNonths;
    }

    public void accelerate(int speedDirrefence) {
        int newSpeed = getCurrentSpeed() + speedDirrefence;
        if (newSpeed == 0) {
            stop();
        } else if (newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);
        } else if (newSpeed > 20 && newSpeed <= 30) {
            changeGear(3);
        } else if (newSpeed < 0) {
            changeGear(0);
        } else {
            changeGear(4);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }

    }
}
