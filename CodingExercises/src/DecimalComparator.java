public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.125, 3.1254);
    }

//this code is not workint
/*    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        if (((firstNumber - secondNumber) > 0.0001) && ((firstNumber - secondNumber) < 0.001)) {
            return true;
        } else if (((secondNumber - firstNumber) > 0.0001) && ((secondNumber - firstNumber) < 0.001)) {
            return true;
        } else if (((firstNumber - secondNumber) == 0.0001) || ((secondNumber - firstNumber) == 0.0001)) {
            return true;
        } else if (((firstNumber - secondNumber) == 0.000) || ((secondNumber - firstNumber) == 0.000)) {
            return true;
        } else if (((firstNumber - secondNumber) >= 0.001) || ((secondNumber - firstNumber) >= 0.001)) {
            return false;
        } else
            return true;
    }*/

//this code is not workint
/*      public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
       if(((firstNumber - secondNumber) >= 0.0001d) && ((firstNumber - secondNumber) < 0.001d)) {
           return true;
       } else if(((firstNumber - secondNumber) <= -0.0001d) && ((firstNumber - secondNumber) > -0.001d)) {
           return true;
       } else if(((firstNumber - secondNumber) == 0)) {
           return true;
       } else {
           return false;
       }
    }*/

        public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
            if(((int)(firstNumber * 1000)) == ((int)(secondNumber * 1000))) {
                return true;
            } else {
                return false;
            }
        }
}

