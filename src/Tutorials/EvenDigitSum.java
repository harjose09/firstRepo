package Tutorials;

public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println("Is -121 " + getEvenDigitSum(-121));
        System.out.println("Is 8 ? " + getEvenDigitSum(8));
        System.out.println("Is 234 ? " + getEvenDigitSum(234));
        System.out.println("Is 456 ? " + getEvenDigitSum(456));
        System.out.println("Is 23432 ? " + getEvenDigitSum(23432));

    }
    public static int getEvenDigitSum (int number){
        int originalNum = number;
        int sum = 0;
        int count = 0;

        int reverse = 0;

        if(number < 0){
            return  -1;
        }

        while (number > 0){
            int lastDigit = number % 10;

            reverse = (reverse * 10) + lastDigit;
            number = number/ 10;
            if(lastDigit % 2 != 0){
                continue;
            }



            sum += lastDigit;



        }


        return sum;
    }
}
