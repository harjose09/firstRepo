public class WhileLoop {

    public static void main(String[] args) {

        int num = 4;
        int sumEven = 0;
        int countEven = 0;
        int countOdd = 0;
        int countAll = 0;

        while(num <= 20){
            countAll++;
            num++;

            if(!isEvenNumber(num)){
                countOdd++;
                continue;
            }
            System.out.println(num +  "....." + isEvenNumber(num));
            countEven ++;


            sumEven = sumEven + num;

            if(countEven == 5) break;

        }


        System.out.println("sumEven = " + sumEven);
        System.out.println("countEven = " + countEven);
        System.out.println("countAll = " + countAll);
        System.out.println("countOdd = " + countOdd);

    }


    public static boolean isEvenNumber(int number){
     boolean result = true;
        if(number % 2 == 0){
            return result;
        } else {
            return false;
        }

    }
}
