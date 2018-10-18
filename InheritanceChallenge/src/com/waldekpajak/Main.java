package com.waldekpajak;

public class Main {

    public static void main(String[] args) {
        Volvo volvoV60 = new Volvo(36);
        volvoV60.steer(45);
        volvoV60.accelerate(30);
        volvoV60.accelerate(20);
        volvoV60.accelerate(-402);
    }
}
