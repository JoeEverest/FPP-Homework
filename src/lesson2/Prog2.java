package lesson2;

public class Prog2 {
    public static void main(String[] args) {
        float a = 1.27f;
        float b = 3.881f;
        float c = 9.6f;

        int castedSum = (int)(a+b+c);

        System.out.println("Casted sum = " + castedSum);

        int roundedSum = Math.round(a+b+c);

        System.out.println("Rounded sum = " + roundedSum);
    }
}
