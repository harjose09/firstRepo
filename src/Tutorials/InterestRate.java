package Tutorials;

public class InterestRate {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++){
            calculateInterest(20000,i);
        }

    }

    public static void calculateInterest(int amount, int interest ){

        double calInterest = amount * (interest/ 100.0);

        System.out.println("With an amount of " + amount + " and interest of " + interest +
                " gives " + calInterest);
    }

}
