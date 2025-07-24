package Tutorials;

public class SwitchCase {


    public static void main(String[] args) {


        System.out.println(qualifiedOrNot(3));


    }


    public static String qualifiedOrNot(int score) {

//
//        if (score == 5 ){
//            System.out.println(" Good job!");
//        } else if (score == 10) {
//            System.out.println("Well done Lad!");
//        } else {
//            System.out.println("Nice anyways!");
//        }

        return switch (score) {
            case 5 -> " Good job!";
            case 10, 15 -> "Well done Lad!";
            default ->  {
                String gumi = "Nice anyways!";
                yield gumi;
            }
        };

//                switch (score ){
//                    case 5 -> System.out.println(" Good job!");
//                    case 10, 15 -> {
//                        System.out.println("Well done Lad!");
//                        System.out.println("Well done Lad!");
//                    }
//                    default -> System.out.println("Nice anyways!");








    }
}
