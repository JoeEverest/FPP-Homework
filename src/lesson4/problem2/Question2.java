package lesson4.problem2;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Minimum letter in “akel” is the letter => " + findMinimum("akel"));
    }

    public static char findMinimum(String word){
        if(word.length() == 1){
            return word.charAt(0);
        }
        char characterAt0 = word.charAt(0);
        char lowestInRest = findMinimum(word.substring(1));

        return (characterAt0 < lowestInRest) ? characterAt0:lowestInRest;
    }
}
