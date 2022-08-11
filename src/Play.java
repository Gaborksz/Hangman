import java.util.ArrayList;

public class Play {

    public static void play() {

        GameMenu.showMenu();
        int userChoice = Util.get_int_UserInput();
        int Lives = setLives(userChoice);
        ArrayList<ArrayList<String>> gameArrays = GameArrays.returnGameArrays(userChoice);
        String gameStatus = "playing";
        gameStatus = runGame(gameStatus, Lives, gameArrays);
        endGame(gameStatus);
    }

    public static ArrayList<String> setupGame(int userChoice) {

        ArrayList<String> temp = new ArrayList<>();

        switch (userChoice) {
            case 1: {                       // easy
                return GameArrays.createInitialWordArray(GameArrays.createSolutionsArrayEasy());
            }
            case 2: {                       // medium
                return GameArrays.createInitialWordArray(GameArrays.createSolutionsArrayMedium());
            }
            case 3: {                       // hard
                return GameArrays.createInitialWordArray(GameArrays.createSolutionsArrayHard());
            }
            default: {
                return temp;
            }
        }
    }

    public static int setLives(int userChoice) {

        switch (userChoice) {
            case 1: {                       // easy
                return 10;
            }
            case 2: {                       // medium
                return 7;
            }
            case 3: {                       // hard
                return 3;
            }
            default: {
                return 0;
            }
        }
    }

    public static String runGame(String gameStatus, int Lives, ArrayList<ArrayList<String>> gameArrays ) {

        ArrayList<String> initialArray = gameArrays.get(0),
                          userArray = gameArrays.get(1),
                          badLettersArray = gameArrays.get(2);

        while ( gameStatus == "playing" ) {

            Util.showGameStatistics(Lives, userArray, initialArray);
            String userNewInput = Util.returnNewUserInput(userArray, badLettersArray);

            if (userNewInput.equals("quit")) {
                return "quit";
            }
//            return = "won";
        }
        return "";
    }

    public static void endGame(String gameStatus) {

        switch (gameStatus) {
            case "won": {
                System.out.println("Congratulations, you have won");
            }
            break;
            case "lost": {
                System.out.println("You have Lost, don't you worry just play again.");
            }
            break;
            case "quit": {
                System.out.println("You have choosen to quit the game, come back and play again");
            }
            break;
            default: {
                //do nothing
            }
        }
    }
}

