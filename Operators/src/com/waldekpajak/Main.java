package com.waldekpajak;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5  = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        /*
        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien!");
        */
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore1 = 90;
        if (topScore1 != 100)
            System.out.println("You got the high score!");

        int topScore2 = 100;
        if (topScore2 > 100)
            System.out.println("You got the high score!");

        int topScore3 = 80;
        if (topScore3 <= 100)
            System.out.println("You got the high score!");

        int secondTopScore = 95;
        if ((topScore1 > secondTopScore) && (topScore1 <100))
            System.out.println("Greater than second top score and less then 100!");

        if ((topScore1 > 90) || (secondTopScore <=90))
            System.out.println("One of these tests is true!");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");                 

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        double myDouble = 20d;
        double mySecondDouble = 80;
        double myResult = myDouble + mySecondDouble;
        myResult *= 25;
            System.out.println("myResult is " + myResult);
        double theReminder = myResult % 40;
            System.out.println("theReminder is " + theReminder);
        if (theReminder <= 20)
            System.out.println("Total was over the limit!");
        

        }
}

































