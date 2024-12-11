package lesson9.problem2;

import java.util.Random;

public class Problem2 {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        System.out.println("Is stack empty? "+ stack.isEmpty());

        for (int i = 0; i < 10; i++) {
            stack.push(new Random().nextInt(10,99));
        }

        System.out.println("Is stack empty? "+ stack.isEmpty());

        System.out.println("Initial values: "+stack);
        System.out.println("Initial size: "+stack.size());

        System.out.println("First item is: "+stack.peek());

        stack.pop();

        System.out.println("Removed first item: "+stack);
        System.out.println("New size: "+stack.size());

    }
}
