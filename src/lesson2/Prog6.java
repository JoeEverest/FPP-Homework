package lesson2;

public class Prog6 {
    public static void main(String[] args) {
        int[] data = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num:data){
            if (num < min) min = num;
            if (num > min && num < secondMin) secondMin = num;
        }

        System.out.println("Second minimum = "+ secondMin);
    }
}
