package lesson4.problem5;

public class Question5 {
    public static void main(String[] args) {
        int[] data = {5, -3, 6, 1, 9, 4};

        System.out.println("The max value = " + findMax(data));
    }

    public static int findMax(int[] arr){
        if(arr.length == 0){
            return 0;
        }

        return findMax(arr, arr.length - 1);
    }

    private static int findMax(int[] arr, int index){
        if (index == 0) {
            return arr[0];
        }

        int maxInRest = findMax(arr, index - 1);
        return (arr[index] > maxInRest) ? arr[index] : maxInRest;
    }
}
