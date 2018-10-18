public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(257));
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        } else {
            int isEven = 0;
            int sum = 0;

            while (number != 0) {
                isEven = number % 10;
                //System.out.println(sum);
                //System.out.println(number);
                number /= 10;
                if (isEven % 2 == 0) {
                    sum += isEven;
//                  System.out.println(sum);
                } else if (isEven % 2 != 0) {
                    sum += 0;
//                  System.out.println(sum);
                }
            }
            return sum;
        }
    }

}

