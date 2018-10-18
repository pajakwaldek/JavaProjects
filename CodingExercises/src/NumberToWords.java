public class NumberToWords {

    public static void main(String[] args) {
        int number = 100;
        System.out.println(" ");
        System.out.println("number: " + number);
        System.out.println(" ");
        System.out.println("numberToWords: ");
        numberToWords(number);
        System.out.println(" ");
        System.out.println("reverse: " + reverse(number));
        System.out.println(" ");
        System.out.println("getDigitCount: " + getDigitCount(number));
        System.out.println(" ");
        System.out.println("getDigitCount(reverse): " + getDigitCount(reverse(number)));

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int digit = 0;
            int rev = reverse(number);
            int nNormal = getDigitCount(number);
            int nReverse = getDigitCount(rev);
            for (int i = 1; i <= nNormal; i++) {
                digit = rev % 10;
                rev /= 10;
                switch (digit) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 0:
                        System.out.println("Zero");
                        break;
                }
            }
        }
    }

    public static int reverse(int number) {
        int digit = 0;
        int rev = 0;
        while (number != 0) {
            digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        return rev;
    }


    public static int getDigitCount(int number) {
        int digit = 0;
        int count = 0;
        if (number < 0) {
            return -1;
        }
        if(number == 0) {
            count++;
        } else {
            while (number > 0) {
                count++;
                digit = number % 10;
                number = number / 10;
            }
        }
        return count;
    }
}
