public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23,254,352));
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (n1 >= 10 && n1 <= 1000 && n2 >= 10 && n2 <= 1000 && n3 >= 10 && n3 <= 1000) {

            int lastDigit1 = 0;
            int lastDigit2 = 0;
            int lastDigit3 = 0;

            lastDigit1 = n1 % 10;
            lastDigit2 = n2 % 10;
            lastDigit3 = n3 % 10;

            if (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
