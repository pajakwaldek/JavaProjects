public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(32);
    }

    public static void printFactors(int number) {
        int Divisor = 0;

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    Divisor = i;
                    System.out.println(Divisor);
                }
            }
        }
    }

