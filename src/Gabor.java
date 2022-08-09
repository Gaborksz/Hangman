import java.util.ArrayList;

public class Gabor {

    public static void main(String[] args) {

        ArrayList<String> solutionList = new ArrayList<>(){{
            add("Budapest");
            add("Moscow");
            add("Ankara");
            add("Bejing");
        }};

        ArrayList<String> initialWordArray = new ArrayList<>(createInitialWordArray(solutionList));
        ArrayList<String> userWordArray = new ArrayList<>(createUserWordArray(initialWordArray));


        System.out.println(initialWordArray);
        System.out.println(userWordArray);
        System.out.println(checkWordForLetter(initialWordArray,"B"));
    }
    public static void printMessage(String text) {
        System.out.println(text);
    }

    public static void printArray(ArrayList<String> array) {
        for (String item : array) {
            System.out.println(item);
        }
    }

    public static ArrayList<String> createInitialWordArray(ArrayList<String> SolutionsArray) {

        ArrayList<String> initalArray = new ArrayList<>();
        double randomID = ((Math.random() * (SolutionsArray.size() - 0)) + 0);
        String strWordPuzzle = SolutionsArray.get((int) randomID);

        for (int i = 0; i < strWordPuzzle.length(); i++) {
            initalArray.add(strWordPuzzle.substring(i,i+1));
        }
        return initalArray;
    }

    public static ArrayList<String> createUserWordArray(ArrayList<String> initialWordArray) {

        ArrayList<String> userWordArray = new ArrayList<>();

        for (int i = 0; i < initialWordArray.size(); i++) {
            userWordArray.add("-");
        }
        return userWordArray;
    }

    public static boolean checkWordForLetter(ArrayList<String> wordArray, String letter) {
        for ( String item : wordArray ) {
            if ( item.equalsIgnoreCase(letter)) {
                return true;
            }
        }
        return false;
    }
}