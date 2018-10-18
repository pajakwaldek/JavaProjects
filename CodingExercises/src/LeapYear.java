public class LeapYear {

    public static void main(String[] args) {
        isLeapYear(1999);

    }

  /*  public static boolean isLeapYear(int year) {
        if((year >= 1 && year <= 9999) && (((year % 4 == 0) && (year % 100 > 0)) || (year % 400 == 0))) {
            return true;
        } else if((year >= 1 && year <= 9999) && ((year % 4 > 0) || (year % 100 == 0) || (year % 400 > 0))) {
            return false;
        } else if(year < 1 && year > 9999) {
            return false;
        }
        return false;
    }*/

    public static boolean isLeapYear(int year) {

        if(year < 1 || year > 9999) {
            return false;
        } else if(((year % 4 == 0) && (year % 100 > 0)) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

   /* public static boolean isLeapYear(int year){

        if((year < 1) || (year > 9999)){
            return false;
        }
        if(year % 4 == 0){
            if((year % 100 != 0) || (year % 400 == 0))
                return true;
        }
        return false;
    }*/
  }

