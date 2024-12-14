package lesson12.problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a score between 0 and 100: ");
        int score;
        try {
            score = input.nextInt();

            if(score < 0 || score > 100){
                throw new UnsupportedOperationException("Number should be between 0 and 100");
            }

        } catch (InputMismatchException e) {
            System.out.println("Input not a number");
            throw e;
        }

        System.out.println("Your score is "+score);
    }
}
