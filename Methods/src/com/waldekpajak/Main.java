package com.waldekpajak;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore (gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore (true, 10000, 8, 200);
        System.out.println("Your final score was" + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("George", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Mark", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Thomas", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louis", highScorePosition);
    }


    public static void displayHighScorePosition (String playersName, int highScorePosition ) {
        System.out.println(playersName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition (int playerScore) {
       /* if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100 ) {
            return 3;
        }
        return 4;*/
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >=500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;

    }
}
