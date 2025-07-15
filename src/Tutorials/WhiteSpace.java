package Tutorials;

public class WhiteSpace {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        calculateScore();


        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);

            System.out.println("Your final score is " + finalScore);
        }




    }


    public static void calculateScore() {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }


    }




//    public static int ageCalculator(int dateOfBirth) {
//        int calc = 2025 - dateOfBirth;
//        return calc;
//
//    }



}
