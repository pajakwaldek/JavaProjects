public class BarkingDog {
    public static void main(String[] args) {

        bark(true,23);
    }
    public static boolean bark(boolean barking, int hourOfDay) {
        if(barking == true && ((hourOfDay > 22 && hourOfDay <= 23) || (hourOfDay < 8 && hourOfDay >= 0))) {
            return true;
        } else if(barking == true && (hourOfDay <= 22 && hourOfDay >=8)) {
            return false;
        } else if(barking == false && (hourOfDay >= 0 || hourOfDay <= 23 || hourOfDay < 0  || hourOfDay > 23)){
            return false;
        }
        return false;
    }

}

