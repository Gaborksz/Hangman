import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameArrays {




    public static ArrayList<String> createSolutionsArrayEasy() {
        ArrayList<String> solutionList = new ArrayList<>() {{
            add("Pecs");
            add("Gyor");
        }};
        return solutionList;
    }


    public static ArrayList<String> createSolutionsArrayMedium() {
        ArrayList<String> solutionList = new ArrayList<>(){{
            add("Budapest");
            add("Moscow");
            add("Ankara");
            add("Bejing");
        }};
        return solutionList;
    }


    public static ArrayList<String> createSolutionsArrayHard() {
        ArrayList<String> solutionList = new ArrayList<>(){{
            add("Budapestaaaaa");
            add("Moscowaaaaaa");
            add("Ankaraaaaaa");
            add("Bejingaaaaa");
        }};
        return solutionList;
    }

    public static ArrayList<String> createInitialWordArray(ArrayList<String> SolutionsArray) {

        ArrayList<String> initalArray = new ArrayList<>();
        double randomID = ((Math.random() * (SolutionsArray.size() - 0)) + 0);
        String strWordPuzzle = SolutionsArray.get((int) randomID);

        for (int i = 0; i < strWordPuzzle.length(); i++) {
            initalArray.add(strWordPuzzle.substring(i, i + 1));
        }
        return initalArray;
    }

    public static ArrayList<String> createUserWordArray(int length) {

        ArrayList<String> userWordArray = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            userWordArray.add("_");
        }
        return userWordArray;
    }


    public static boolean checkWordForLetter(ArrayList<String> wordArray, String letter) {
        for (String item : wordArray) {
            if (item.equalsIgnoreCase(letter)) {
                return true;
            }
        }
        return false;
    }
}

