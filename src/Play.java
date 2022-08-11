import java.util.ArrayList;

public class Play {

    public static void play() {

        GameMenu.showMenu();
        int userChoice = Util.get_int_UserInput();
        int Lives = setLives(userChoice);
        ArrayList<Character> livesArray = GameArrays.createLivesArray(Lives);
        ArrayList<ArrayList<String>> gameArrays = GameArrays.returnGameArrays(userChoice);
        String gameStatus = "playing";
        gameStatus = runGame(gameStatus, Lives, gameArrays, livesArray);
        endGame(gameStatus, gameArrays.get(0));
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

    public static String runGame(String gameStatus, int Lives, ArrayList<ArrayList<String>> gameArrays, ArrayList<Character> livesArray) {

        ArrayList<String> initialArray = gameArrays.get(0),
                          userArray = gameArrays.get(1),
                          badLettersArray = gameArrays.get(2);

        while ( gameStatus == "playing" ) {

            Util.showGameStatistics(Lives, userArray,livesArray);
            String newUserInput = Util.returnNewUserInput(userArray, badLettersArray);

            if (newUserInput.equals("quit")) {
                return "quit";
            }
            if (!GameArrays.checkArrayForLetter( initialArray, newUserInput)) {
                if (--Lives < 1) {return "lost";}
                badLettersArray.add(newUserInput);
                livesArray.remove(livesArray.size()-1);
                System.out.println(badLettersArray + "List of your wrong letters");
                continue;
            }
            GameArrays.showLettersInUserArray(initialArray, userArray, newUserInput);
            if (initialArray.equals(userArray)){
                return "won";
            }
        }
        return "";
    }

    public static void endGame(String gameStatus, ArrayList<String> initialArray) {

        switch (gameStatus) {
            case "won": {
                System.out.println("Congratulations, you have won");
                System.out.println("The solution of the game is: " + initialArray);
            }
            break;
            case "lost": {
                System.out.println("You have Lost, don't you worry just play again.");
                System.out.println("The solution of the game is: " + initialArray);
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

