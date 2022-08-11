import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameArrays {

    public static ArrayList<ArrayList<String>> returnGameArrays(int userChoice) {
        ArrayList<ArrayList<String>> gameArrays = new ArrayList(){};

        gameArrays.add(Play.setupGame(userChoice));
        gameArrays.add(GameArrays.createUserWordArray(gameArrays.get(0).size()));
        gameArrays.add(new ArrayList<>());

        return gameArrays;
    }

    public static ArrayList<String> createSolutionsArrayEasy() {
        ArrayList<String> solutionList = new ArrayList<>(){};
            for (String country:Countries.getAllCountries()){
                if(country.length() < 5){
                    solutionList.add(country);
                }
            }
        System.out.println(solutionList);
        return solutionList;
    }


    public static ArrayList<String> createSolutionsArrayMedium() {
        ArrayList<String> solutionList = new ArrayList<>(){};
        for (String country:Countries.getAllCountries()){
            if(country.length() >= 5 && country.length() < 9){
                solutionList.add(country);
            }
        }
        System.out.println(solutionList);
        return solutionList;
    }


    public static ArrayList<String> createSolutionsArrayHard() {
        ArrayList<String> solutionList = new ArrayList<>(){};
        for (String country:Countries.getAllCountries()){
            if(country.length() >= 9 ){
                solutionList.add(country);
            }
        }
        System.out.println(solutionList);
        return solutionList;
    }

    public static ArrayList<String> createInitialWordArray(ArrayList<String> SolutionsArray) {

        ArrayList<String> initialArray = new ArrayList<>();
        double randomID = ((Math.random() * (SolutionsArray.size() - 0)) + 0);
        String strWordPuzzle = SolutionsArray.get((int) randomID);

        for (int i = 0; i < strWordPuzzle.length(); i++) {
            initialArray.add(strWordPuzzle.substring(i, i + 1));
        }
        return initialArray;
    }

    public static ArrayList<String> createUserWordArray(int length) {

        ArrayList<String> userWordArray = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            userWordArray.add("_");
        }
        return userWordArray;
    }
    public static boolean checkArrayForLetter(ArrayList<String> wordArray, String letter) {
        for (String item : wordArray) {
            if (item.equalsIgnoreCase(letter)) {
                return true;
            }
        }
        return false;
    }
    public static void showLettersInUserArray(ArrayList<String> initialArray, ArrayList<String> userArray, String userInput){
        for (int i=0; i < initialArray.size();i++){
            if(initialArray.get(i).equalsIgnoreCase(userInput)){
                userArray.set(i,initialArray.get(i));
            }
        }
    }
}


