package com.waldekpajak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

//        while(true) {
        while(count < 10) {
            int order = count + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner .nextInt();
                count++;
                sum += number;
//                if (count == 10) {
//                    break;
//                }
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
