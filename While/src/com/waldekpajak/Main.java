package com.waldekpajak;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }


/*        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number is " + number);
        }*/

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number is " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found is " + evenNumbersFound);

        System.out.println("The sum of the digits in number " + number + " is: " + sumDigits(125));
        System.out.println("The sum of the digits in number 125 is: " + sumDigits(-125));
        System.out.println("The sum of the digits in number 125 is: " + sumDigits(4));
        System.out.println("The sum of the digits in number 125 is: " + sumDigits(321236565));

//        int number = 5;
//        int finishNumber = 20;
//        while(number <= finishNumber) {
//            if(!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//        }



/*        for(int i=1;i<7; i++) {
            System.out.println("Count value is " + count);
        }
*/


/* THE SAME LIKE THE WHILE ABOVE
        for(count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }
*/


/*        count = 1;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
*/


/*        count = 6;
        do {
            System.out.println("Count value is " + count);
            count++;
            if(count > 100) {
                break;
            }
        } while(count != 6);
*/

    }

    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }
        int sum =0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {
            // extract the least significant digit
            int digit = number % 10;
            sum += digit;
            // drop leasr significant digit
            number /= 10; // same as number = number / 10
            }
            return sum;
    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }
}
