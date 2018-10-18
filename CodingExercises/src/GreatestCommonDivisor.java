public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int maxDivisor = 0;

        if (first < 10 || second < 10) {
            return -1;
        }
        if (first > second) {
            for (int i = 1; i <= first; i++) {
                if (first % i == 0 && second % i == 0) {
                    maxDivisor = i;
                }
            }
        } else {
            for (int i = 1; i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    maxDivisor = i;
                }
            }
        }
        return maxDivisor;
    }
}


