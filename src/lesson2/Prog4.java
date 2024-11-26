package lesson2;

import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args) {
        String[] originalArray = {"horse", "dog", "cat", "horse", "dog"};
        int orgLen = originalArray.length;

        int uniqueWords = originalArray.length;

        for (int i = 0; i < orgLen; i++) {
            String currentWord = originalArray[i];

            for (int j = i+1; j < orgLen; j++) {
                if(currentWord == null) break;
                if (currentWord.equals(originalArray[j])){
                    uniqueWords--;
                    originalArray[j] = null;
                }
            }
        }

        String[] arrayWithoutDuplicates = new String[uniqueWords];

        for (int i = 0; i < uniqueWords; i++) {
            for (int j = 0; j < orgLen; j++) {
                if(originalArray[j] != null){
                    arrayWithoutDuplicates[i] = originalArray[j];
                    originalArray[j] = null;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arrayWithoutDuplicates));
    }
}
