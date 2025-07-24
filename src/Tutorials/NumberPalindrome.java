package Tutorials;

public class NumberPalindrome {


    public static void main(String[] args) {


        System.out.println("Is -121 a palindrome? " + isPalindrome(-121));
        System.out.println("Is 8 a palindrome? " + isPalindrome(8));
        System.out.println("Is 234 a palindrome? " + isPalindrome(234));
        System.out.println("Is 456 a palindrome? " + isPalindrome(456));
        System.out.println("Is 23432 a palindrome? " + isPalindrome(23432));


    }

    public static boolean isPalindrome (int number){
        int originalNum = number;

        int reverse = 0;

        if(number < 0){
            number *= -1;
            originalNum = number;
        }

        while (number > 0){
            int lastDigit = number % 10;


            reverse = (reverse * 10) + lastDigit;
            number = number/ 10;
        }


        return originalNum == reverse;



    }
}
