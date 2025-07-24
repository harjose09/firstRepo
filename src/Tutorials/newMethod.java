package Tutorials;

public class newMethod {

    public static void main(String[] args) {




    int resultPosition = calculateHighScorePOsition(25);
    displayHighscorePosition("James", resultPosition);

         resultPosition = calculateHighScorePOsition(100);
        displayHighscorePosition("Chris", resultPosition);

        resultPosition = calculateHighScorePOsition(500);
        displayHighscorePosition("Jane", resultPosition);

        resultPosition = calculateHighScorePOsition(1000);
        displayHighscorePosition("Rice", resultPosition);

        resultPosition = calculateHighScorePOsition(1500);
        displayHighscorePosition("Lucio", resultPosition);






        int x = 1;
        int y = ++x;

        System.out.println(x);
        System.out.println(y);

        System.out.println("...........");
        int k = 1;
        int j = k++;

        System.out.println(k);
        System.out.println(j);







    }

    public static void displayHighscorePosition(String playerName, int displayScore) {

        System.out.println(playerName + " managed to get the position " + displayScore + " on the high score list.");


    }

    public static int calculateHighScorePOsition(int playersScore) {
//        if (playersScore >= 1000) {
//            return 1;
//        } else if ((playersScore >= 500) && (playersScore < 1000)) {
//            return 2;
//        } else if ((playersScore >= 100) && (playersScore < 500)) {
//            return 3;
//        } else {
//            return 4;
//        }
        return (playersScore >= 1000) ? 1 : ((playersScore >= 500) && (playersScore < 1000)) ? 2
        : ((playersScore >= 100) && (playersScore < 500)) ?  3 : 4;



    }










}
