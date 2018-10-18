package com.waldekpajak;

public class Main {

    public static void main(String[] args) {

        // width od int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width od float = 32 (4 bytes)
	    float myFloatValue = 5f / 3f;
        // width od double= 64 (8 bytes)
	    double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        double pounds = 200d;
        double conversion = 0.45359237d;
        double kilograms =  (pounds * conversion);

        System.out.println("10 pounds is a " + kilograms + " kilograms)");

    }
}
