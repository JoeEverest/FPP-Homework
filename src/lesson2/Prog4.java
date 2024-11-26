package lesson2;

import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args) {
        String[] originalArray = {"horse", "dog", "cat", "horse", "dog"};

        int originalCount = 1;
        for (int i = 0; i < originalArray.length; i++) {
            String currentWord = originalArray[i];

            for (int j = i+1; j < originalArray.length; j++) {
                if(currentWord == null) break;
                if (currentWord.equals(originalArray[j])){
                    ++originalCount;
                    originalArray[j] = null;
                }
            }
        }

        String[] arrayWithoutDuplicates = new String[originalCount];

        for (int i = 0; i < originalCount; i++) {
            for (int j = 0; j < originalArray.length; j++) {
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
