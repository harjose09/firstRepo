package Tutorials;

public class NatoChar {


    public static void main(String[] args) {

        char natoChar = 'H';
        switch(natoChar){
            case 'A':
                System.out.println(natoChar + " = Able");
                break;
            case 'B':
                System.out.println(natoChar + " = Baker");
                break;
            case 'C':
                System.out.println(natoChar + " = Charlie");
                break;
            case 'D':
                System.out.println(natoChar + " = Dog");
                break;
            case 'E':
                System.out.println(natoChar + " = Easy");
                break;
            default:
                System.out.println("letter " + natoChar + " was not found in switch");


        }

    }



}
