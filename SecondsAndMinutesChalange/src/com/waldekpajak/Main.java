package com.waldekpajak;

public class Main {

    public static void main(String[] args) {

    getDurationString(1640,25);
    getDurationString(555000);
    }


    private static String getDurationString (int minutes, int seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("Invalid value.");
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(hours + "h " + remainingMinutes + "m " + seconds + "s ");
        return null;
    }

    private static String getDurationString (int seconds) {
        if(seconds < 0) {
            System.out.println("Invalid value.");
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(minutes + "m " + remainingSeconds + "s ");
        return getDurationString(minutes, remainingSeconds);

    }

}
