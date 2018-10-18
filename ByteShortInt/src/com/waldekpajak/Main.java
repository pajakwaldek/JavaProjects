package com.waldekpajak;

public class Main {

    public static void main(String[] args) {
/*
        // 32bit
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // 8bit
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // 16bit
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue / 2);

        // 64bit
        long myLongValue = 9_223_372_036_854_775_807L;
*/

        byte myByteValue = 5;
        short myShortValue = 10;
        int myIntValue = 50;

        long myLongValue = 50000L + 10L * (myByteValue + myIntValue + myShortValue);
        short myShortValue2 = (short) (1000 + 10 * (myByteValue + myIntValue + myShortValue));
        System.out.println("myLongValue = " + myLongValue);
        System.out.println("myShortValue = " + myShortValue2);
    }
}
