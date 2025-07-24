public class DayOfTheWeek {

    public static void main(String[] args) {

        printDayOfTheWeek(2);
        printDayOfTheWeek(9);
        printDayOfTheWeek(5);
        System.out.println(".................................");
        printDayWeek(2);
        printDayWeek(8);
        printDayWeek(0);

    }


    public static void printDayOfTheWeek(int day){


        switch (day){
            case 0-> System.out.println(day + " Sunday");
            case 1-> System.out.println(day + " Monday");
            case 2-> System.out.println(day + " Tuesday");
            case 3-> System.out.println(day + " Wednesday");
            case 4-> System.out.println(day + " Thursday");
            case 5-> System.out.println(day + " Friday");
            case 6-> System.out.println(day + " Saturday");
            default -> System.out.println(day + " Invalid Day");
        }
    }

    public static void printDayWeek(int day){

        if (day == 0){
            System.out.println(day + " Sunday");
        } else if (day == 1){
            System.out.println(day + " Monday");
        } else if (day == 2) {
            System.out.println(day + " Tuesday");
        } else if (day == 3) {
            System.out.println(day + " Wednesday");
        } else if (day == 4) {
            System.out.println(day + " Thursday");
        } else if (day == 5) {
            System.out.println(day + " Friday");
        } else if (day == 6) {
            System.out.println(day + " Saturday");
        } else {
            System.out.println(day + " Invalid Day");
        }
    }
}
