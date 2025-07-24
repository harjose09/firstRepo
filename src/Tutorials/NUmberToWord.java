package Tutorials;

public class NUmberToWord {

    public static void main(String[] args) {

        printNumberInWord(2);

    }


    public static void printNumberInWord(int number){

        String numToWord;

        switch (number){
            case 0 -> numToWord = "ZERO";
            case 1 ->numToWord = "ONE";
            case 2 -> numToWord = "TWO";
            case 3 -> numToWord = "THREE";
            case 4 -> numToWord = "FOUR";
            case 5 -> numToWord = "FIVE";
            case 6 -> numToWord = "SIX";
            case 7 -> numToWord = "SEVEN";
            case 8 -> numToWord = "EIGHT";
            case 9 -> numToWord = "NINE";
            default -> numToWord = "OTHER";

        }
        System.out.println(numToWord);

    }
}
