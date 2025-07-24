package Tutorials;

public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println("Is -121 " + sumFirstAndLastDigit(-121));
        System.out.println("Is 8 ? " + sumFirstAndLastDigit(8));
        System.out.println("Is 234 ? " + sumFirstAndLastDigit(234));
        System.out.println("Is 456 ? " + sumFirstAndLastDigit(456));
        System.out.println("Is 23432 ? " + sumFirstAndLastDigit(23432));

    }

    public static int sumFirstAndLastDigit (int number){
        int originalNum = number;


        int reverse = 0;

        if(number < 0){
            return  -1;

        }

        while (number > 0){
            int lastDigit = number % 10;


            reverse = (reverse * 10) + lastDigit;
            number = number/ 10;
        }
        int lastOne = reverse % 10;
        int lastTwo = originalNum % 10;


        int gem = lastOne + lastTwo;
        return gem;

    }

}
