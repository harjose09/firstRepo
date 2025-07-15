package Tutorials;

import java.util.Scanner;

public class Daysoftheweek {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter CGPA ");
        double cgpa = scanner.nextDouble();
        int grade = (int) (cgpa * 10);

        String gradeLevel;
        switch(grade){
            case 45: case 46: case 47: case 48: case 49: case 50:
                gradeLevel = "First Class";
                break;
            case 35: case 36: case 37: case 38: case 39: case 40:
            case 41: case 42: case 43: case 44:
                gradeLevel = "Second Class Upper";
                break;
            case 25: case 26: case 27: case 28: case 29: case 30:
            case 31: case 32: case 33: case 34:
                gradeLevel = "Second Class Lower";
                break;
            case 15: case 16: case 17: case 18: case 19: case 20:
            case 21: case 22: case 23: case 24:
                gradeLevel = "Third Class";
                break;
            default:
                gradeLevel = "Pass";

        }
        System.out.println("Your grade is " + gradeLevel);
    }
}
