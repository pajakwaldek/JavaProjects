public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(21512));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int newNumber = number;
        while (newNumber != 0 ) {
            reverse = (reverse * 10) + (newNumber % 10);
            newNumber /= 10;
        }
        return (number == reverse);
    }
}
