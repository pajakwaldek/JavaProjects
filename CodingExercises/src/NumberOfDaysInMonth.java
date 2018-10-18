public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        isLeapYear(2020);
        getDaysinMonth(2, 2020);
    }

    public static boolean isLeapYear(int year) {

        if (((year % 4 == 0) && (year % 100 > 0)) || (year % 400 == 0)) {
            return true;
        } else if (year < 1 || year > 9999) {
            return false;
        }
        return false;
    }

    public static int getDaysinMonth(int month, int year) {
        int days = 0;
        if ((month < 1 && month > 12) && (year < 1 && year > 9999)) {
            return -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
        }
        return days;
    }
}

 /*   public static int getDaysinMonth(int month, int year) {

        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    int days = 31;
                    return days;
                case 2: {
                    if (isLeapYear(year)) {
                        days = 29;
                        return days;
                    } else {
                        days = 28;
                        return days;
                    }
                }
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    return days;
            }
        } else {
            return -1;
        }
        return -1;
    }*/

