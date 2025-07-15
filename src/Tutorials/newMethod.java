package Tutorials;

public class newMethod {

    public static void main(String[] args) {


    int score = 120;
        System.out.println(calculateHighScorePOsition(score));
    int resultPosition = calculateHighScorePOsition(score);


    displayHighscorePosition("James", resultPosition);





    }

    public static void displayHighscorePosition(String playerName, int displayScore) {

        System.out.println(playerName + " managed to get the position " + displayScore + " on the high score list.");


    }

    public static int calculateHighScorePOsition(int playersScore) {
        if (playersScore >= 1000) {
            return 1;
        } else if ((playersScore >= 500) || (playersScore < 1000)) {
            return 2;
        } else if ((playersScore >= 100) || (playersScore < 500)) {
            return 3;
        } else {
            return 4;
        }

    }




}
