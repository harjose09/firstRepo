package Tutorials;

public class Tutor {

    public static void main(String[] args) {
        int num = 0;
        while (num < 15){
            System.out.println(num);
            num++;


            if (num <= 5){
                System.out.println("skipp " + num);
                continue;
            }

            System.out.println(",,,," + num);

            if (num  >= 10){
                System.out.println(" break");
                break;
            }

        }
    }
}
