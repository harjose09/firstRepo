package Tutorials;

public class LeapYearMonth {

    public static void main(String[] args) {

        System.out.println(isLeapYear(1988));
        System.out.println(isLeapYear(1992));
        System.out.println(isLeapYear(1800));

    }
    public static boolean  isLeapYear(int year){


        if(year >= 1 && year <= 9999 ){
            if((year % 4 == 0) && (year % 100 != 0)){
                return true;
            } else if ((year % 4 == 0) && (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){


        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)){
            if(isLeapYear(year)){
                if (month == 2){
                    return 29;
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    return 30;
                } else {
                    return 31;
                }
            } else {
                if (month == 2){
                    return 28;
                }else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    return 30;
                }
                else {
                    return 31;
                }
            }
        }else {
            return -1;
        }
    }
}
