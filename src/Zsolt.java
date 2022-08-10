import java.util.Scanner;

public class Zsolt {
    public static void main(String[] args) {
        do {
            initializingStringInitial();
            initializingStringWorking();
            play("", 5);
            //
            // public static void play(String word, int lives)
        } while (isUserInputQuit("true"));
    }
    public static void play(String word, int lives) {
        getUserInput();
    }
    public static String initializingStringInitial(){
        String initialString = "Budapest";
        return initialString;
    }

    public static String initializingStringWorking(){
        String workingString = "________";
        return workingString;
    }


    public static void getUserInput() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hangman game. You have to guess a geographical expression.");
        System.out.println("It can be played by typing a letter. You can exit by adding quit.");
        System.out.println("Your guess: ");
        String guess = userInput.nextLine();
        isUserInputQuit(guess);
        char userChar = guess.charAt(0);
        System.out.println(isTheCharacterIsArrayInitial(initializingStringInitial(), userChar));
    }
    public static boolean isUserInputQuit(String userInput){
        boolean boolQuit;
        if (userInput.equals("quit")) {
            boolQuit = true;
        } else {
            boolQuit = false;
        }
        return boolQuit;
    }
    public static boolean isTheCharacterIsArrayInitial (String str, char userChar){
        boolean boolIsTheCharacterIsArrayInitial;
        if (str.indexOf(userChar)>-1) {
            boolIsTheCharacterIsArrayInitial = true;
        } else {
            boolIsTheCharacterIsArrayInitial = false;
        }
        return boolIsTheCharacterIsArrayInitial;
    }
}