import java.util.ArrayList;
import java.util.Arrays;

public class Play {

    public static void play() {

        GameMenu.showMenu();
        int userChoice = Util.gameMenuUserInput();
        int Lives = setLives(userChoice);
        ArrayList<String> initialArray = setupGame(userChoice);
        ArrayList<String> userArray = GameArrays.createUserWordArray(initialArray.size());
        runGame(Lives, initialArray, userArray);
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

    public static void runGame(int Lives, ArrayList<String> initialArray, ArrayList<String> userArray) {

        String status = "playing";

        while ( status == "playing" ) {
            System.out.println("You have " + Lives + " Lives.");
            System.out.println("the word: " + userArray);
            System.out.println(initialArray);
            boolean newInput = false;
            while ( !newInput ) {
                String userInput = Util.getUserInput();
                if(Util.isUserInputQuit(userInput)){break;}
                if(userInput.length() > 1){continue;}
                if(Util.isTheCharacterIsArrayInitial(userInput)){
                    System.out.println("benne van");
                }
                System.out.println("newInput while");
                newInput = true;
            }

            System.out.println("runGame while");
            status = "won";
        }

    }

}