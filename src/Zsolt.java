import java.util.Scanner;

public class Zsolt {
    public static void main(String[] args) {
        char[] charArrayInitial = new char[] {'B','u','d','a','p','e','s','t'};
        char[] charArrayUserWorking = new char[] {'_','_','_','_','_','_','_','_'};
        do {
        System.out.println("Megint dolgoznom kell!");
        // public static void playMethodInitializing();
            // public static void play(String word, int lives)
            } while (isUserInputQuit("userInput"));
    }

    public static void play(String word, int lives) {
        getUserInput("Hi");
        }

    public static void getUserInput(String input) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hangman game. You have to guess a geographical expression.");
        System.out.println("It can be played by typing a letter. You can exit by adding quit.");
        System.out.println("Your guess: ");
        String guess = userInput.nextLine();
        isUserInputQuit(guess);
        whichCharacter(guess);

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
    public static void whichCharacter(String userInput){
        char userChar = userInput.charAt(0);
        System.out.println("The character is: " + userChar);
    }
}
