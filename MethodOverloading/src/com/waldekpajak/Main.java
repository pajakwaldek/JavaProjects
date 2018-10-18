package com.waldekpajak;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Waldek", 2000);
        System.out.println("New score is " + newScore + " points.");
        calculateScore(500);
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(0, 13);
        if (centimeters < 0.0)
            System.out.println("Invalid parameters");

        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(157);
        calcFeetAndInchesToCentimeters(-10);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + "scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

/*  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if )(feet >= 0) || (inches >= 0 && inches <= 12)) {
            double centimetres = ((feet * 12) * 2.54);
            centimetres += inches * 2.54;
            System.out.println("Centimetres: " + centimetres);
        }
        return -1;
    }*/

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Bad feet or inches parameters");
            return -1;
        }

        double centimeters = ((feet * 12) * 2.54);
        centimeters += inches * 2.54;
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " centimetres.");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Bad inches parameters");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingFeet = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingFeet + "inches");
        return calcFeetAndInchesToCentimeters(feet, remainingFeet);
    }

}
