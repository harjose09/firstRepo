package Tutorials;

public class SharedDigit {





    public static void main(String[] args) {
        System.out.println(hasSharedDigit(23, 45));


    }

    public static boolean hasSharedDigit (int number1, int number2){



        if((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)){
            int a1 = number1 / 10;
            int a2 = number1 % 10;
            int b1 = number2 / 10;
            int b2 = number2 % 10;

            while (number2 > 0){

                int digit = number2 % 10;
                if(digit == a1 || digit == a2){
                    return true;
                }
                number2 = number2 / 10;
            }



            while (number1 > 0){

                int digit = number1 % 10;
                if(digit == b1 || digit == b2){
                    return true;
                }
                number1 = number1 / 10;
            }
        } else {
            return false;
        }





        return false;

    }
}
