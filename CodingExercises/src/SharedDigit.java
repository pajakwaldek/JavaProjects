public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }

 /*   public static boolean hasSharedDigit(int num1, int num2) {
        if (((num1 < 10) || (num1 > 99)) || ((num2 < 10) || (num2 > 99))) {
            return false;
        }
        while (num1 != 0) {
            int number1 = num1 % 10;
            while (num2 != 0) {
                int number2 = num2 % 10;
                if (number1 == number2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }*/

    public static boolean hasSharedDigit (int num1, int num2) {

        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        if ((num1 / 10 == (num2 / 10)) || ((num1 / 10) == (num2 % 10))) {
            return true;

        }else if ((num1 % 10) == (num2 / 10) || (num1 % 10) == (num2 % 10)) {

            return true;

        }else{

            return false;
        }
    }
}
