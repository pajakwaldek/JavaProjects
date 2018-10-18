public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number) {

        int newNumber = number;
        int sum = 0;

        if (newNumber < 1) {
            return false;

        } else {

            for (int i = 1; i < newNumber; i++) {
                if (newNumber % i == 0) {
                    sum += i;
                    if (sum == newNumber) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

