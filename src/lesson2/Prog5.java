package lesson2;

import java.util.Arrays;

public class Prog5 {
    public static int[] combine(int[] a, int[] b){
        int combinedLength = a.length +b.length;

        int[] combinedArray = new int[combinedLength];

        for (int i = 0; i < a.length; i++) {
            combinedArray[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            combinedArray[a.length+i] = b[i];
        }

        return combinedArray;
    }
    public static void main(String[] args) {

        var output = combine(new int[]{5,6,-4,3,1}, new int[] {3,8,9,11});

        System.out.println(Arrays.toString(output));

    }
}
