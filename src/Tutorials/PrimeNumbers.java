package Tutorials;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.println(isPrime( 9) ? " is a prime number" : " is not a prime number");


    }

    public static boolean isPrime(int prime){
        int count = 0;

        if(prime <= 2){
            return (prime == 2);
        }
        for (int i = 2 ; i < prime;  i++){
            if(prime % i == 0 ) {
                return false;
            }
            count++;

        }
        return true;

    }

}
