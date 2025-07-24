package Tutorials;

public class DigitChallenge {

    public static void main(String[] args) {
        System.out.println("Sum digits of -5 = " + sumDigits(-5));
        System.out.println("Sum digits of 0 = " + sumDigits(0));
        System.out.println("Sum digits of 56 = " +sumDigits(56));
        System.out.println("Sum digits of 222 = " +sumDigits(222));
        System.out.println("Sum digits of 1234 = " +sumDigits(1234));








    }

    public static int sumDigits(int numbers) {


        if (numbers < 0) {
            return -1;
        }
        int sum = 0;

        while (numbers > 9){

            sum += (numbers % 10);
            numbers = numbers / 10;
        }
        sum += numbers;
        return sum;
    }
}
