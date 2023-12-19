public class MainSection5_48 {
    public static void main(String[] args) {

//        displayHighScorePosition("tim", calculateHighScorePosition(1500));
//        displayHighScorePosition("tim", calculateHighScorePosition(1000));
//        displayHighScorePosition("tim", calculateHighScorePosition(500));
//        displayHighScorePosition("tim", calculateHighScorePosition(100));
//        displayHighScorePosition("tim", calculateHighScorePosition(25));


        System.out.println(areEqualByThreeDecimalPlaces(0.0,0.0));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756,3.1757));
    }

    public static void displayHighScorePosition(String playerName, int positionOnHighScoreList) {
        System.out.println(playerName + " managed to get into position " + positionOnHighScoreList + " high score list \n");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int returnScore;
        if (playerScore >= 1000) {
            returnScore = 1;
        } else if (playerScore >= 500) {
            returnScore = 2;
        } else if (playerScore >= 100) {
            returnScore = 3;
        } else {
            returnScore = 4;
        }

        return returnScore;
    }



    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        long firstRounded = (long) (first * 1000);
        long secondRounded = (long) (second * 1000);
        System.out.println(firstRounded);
        System.out.println(secondRounded);
        return firstRounded == secondRounded;




    }
}