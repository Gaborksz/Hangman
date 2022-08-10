import java.util.Scanner;

public class Util {

    public static int gameMenuUserInput() {

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return  userInput;
    }

    public static String getUserInput() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hangman game. You have to guess a geographical expression.");
        System.out.println("It can be played by typing a letter. You can exit by adding quit.");
        System.out.println("Your guess: ");
        String guess = userInput.nextLine();
        //isUserInputQuit(guess);
        //char userChar = guess.charAt(0);
        return guess;
        //System.out.println(isTheCharacterIsArrayInitial(initializingStringInitial(), userChar));
    }
    //public static void userInput

    public static boolean isUserInputQuit(String userInput){
        boolean boolQuit;
        if (userInput.equals("quit")) {
            boolQuit = true;
        } else {
            boolQuit = false;
        }
        return boolQuit;
    }

    public static boolean isTheCharacterIsArrayInitial (String userChar){
        String hunLetters = "AaÁáBbCcDdEeÉéFfGgHhIiÍíJjKkLlMmNnOoÓóÖöŐőPpQqRrSsTtUuÚúÜüŰűVvWwXxYyZz";
        boolean boolIsTheCharacterIsArrayInitial;
        if (hunLetters.indexOf(userChar)>-1) {
            boolIsTheCharacterIsArrayInitial = true;
        } else {
            boolIsTheCharacterIsArrayInitial = false;
        }
        return boolIsTheCharacterIsArrayInitial;
    }

}
