package com.waldekpajak;

public class Main {

    public static void main(String[] args) {

        System.out.println("10000 at 2% interest = " + calculateInterest(10000, 2));
        System.out.println("10000 at 2% interest = " + calculateInterest(10000, 3));
        System.out.println("10000 at 2% interest = " + calculateInterest(10000, 4));
        System.out.println("10000 at 2% interest = " + calculateInterest(10000, 5));

        for(int i=1; i<6; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for(int i=2; i<9; i++) {
            System.out.println("10000 at 2% interest = " + String.format("%.2f", calculateInterest(10000, (double)i)));
        }
        System.out.println("***********************");

        for(int i=8; i>=2; i--) {
            System.out.println("10000 at 2% interest = " + String.format("%.2f", calculateInterest(10000, (double)i)));
        }

        int count = 0;
        for(int i=10; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

//  LICZBY PIERWSZE

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }
//        for(int i=2; i<=n/2; i++) {
          for(int i=2; i<=(long) Math.sqrt(n); i++) {
              System.out.println("Looping " + i);
            if(n % i== 0) {
                return false;
            }
        }
    return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }
}
