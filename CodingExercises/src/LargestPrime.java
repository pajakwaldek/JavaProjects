public class LargestPrime {

    public static void main(String[] args) {
        int number = 45;
        System.out.println(getLargestPrime(number));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        } else {
            boolean prime = false;
            for (int i = number; i >= 2; i--) {
                if ((number % i) == 0) {
                    prime = true;
                    for (int j = i / 2; j >= 2; j--) {
                        if (i % j == 0) {
                            prime = false;
                        }
                    }
                }
                if (prime) {
                    return i;
                }
            }
        }
        return -1;
    }
}
