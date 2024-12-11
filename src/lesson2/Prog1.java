package lesson2;

import java.util.Random;

public class Prog1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int x = rand.nextInt(1, 9+1); // bound isn't inclusive so +1
        double piPowerX = Math.pow(Math.PI, x);

        System.out.printf("PI to the power of X %.2f", piPowerX);

        System.out.println();

        int y = rand.nextInt(3,14+1); // bound isn't inclusive so +1
        double yPowerPI = Math.pow(y, Math.PI);

        System.out.printf("Y to the power of PI = %.2f", yPowerPI);
    }
}
