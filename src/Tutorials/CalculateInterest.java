package Tutorials;

public class CalculateInterest {
    public static void main(String[] args) {
    for (double i = 7.5; i <=  10.0; i += 0.25 ){
        System.out.println(calculateInterest(100, i));

}
    }

    public static double calculateInterest(int amount, double rate){
        double calcINtrt = amount * ( rate/ 100.0);
        return calcINtrt;

    }

}

