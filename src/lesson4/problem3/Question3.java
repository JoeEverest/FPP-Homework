package lesson4.problem3;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9, 13};

        reverseArray(data);

        System.out.println(Arrays.toString(data));
    }

    public static void reverseArray(int[] arr){
        reverseArray(arr, 0, arr.length-1);
    }

    private static void reverseArray(int[] arr, int left, int right){
        if(left >= right){
            return;
        }

        int temp = arr[right];
        arr[right] =  arr[left];
        arr[left] = temp;

        reverseArray(arr, ++left, --right);
    }
}
