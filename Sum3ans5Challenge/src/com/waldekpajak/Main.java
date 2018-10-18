package com.waldekpajak;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for(int i = 1; i <= 1000; i++) {
            if((i % 5 == 0) && (i % 3 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number is: " + i + " and it's divided with 3 and also with 5");
            }
            if(count == 5) {
                break;
            }
        }
        System.out.println(" Sum is: " + sum);
    }
}
