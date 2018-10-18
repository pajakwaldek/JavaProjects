package com.waldekpajak;

public class Main {

    public static void main(String[] args) {

/*        int value = 1;

        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }*/

    int switchValue = 4;

    switch(switchValue) {

        case 1:
            System.out.println("Value was 1");
            break;

        case 2:
            System.out.println("Value was 2");
            break;

        case 3:case 4:case 5:
            System.out.println("Was a 3, or a 4, or a 5");
            System.out.println("Actually it was a " + switchValue);
            break;

        default:
            System.out.println("Was not 1 or 2");
            break;

    }


        char charValue = 'A';

        switch(charValue) {

            case 'A':
                System.out.println("Char was A");
                break;

            case 'B':
                System.out.println("Char was B");
                break;

            case 'C': case 'D':case 'E':
                System.out.println("Was a C, or a D, or a E");
                System.out.println("Actually it was a " + charValue);
                break;

            default:
                System.out.println("Was not C or D nor E");
                break;

        }


        String month = "JuNE";
        switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

    }

    private static void printDayOfTheWeek(int day) {

        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }

/*        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;
            }
        }*/

}












