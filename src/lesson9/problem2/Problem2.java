package lesson9.problem2;

import java.util.Random;

public class Problem2 {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        System.out.println("Is stack empty? "+ stack.isEmpty()+"\n");

        for (int i = 0; i < 10; i++) {
            int number = new Random().nextInt(10,99);
            stack.push(number);
            System.out.println("Added "+number+" to stack. Stack is now: "+stack);
        }

        System.out.println("\nIs stack empty? "+ stack.isEmpty());

        System.out.println("Current size: "+stack.size());

        System.out.println("\nFirst item is: "+stack.peek());

        stack.pop();

        System.out.println("Removed first item: "+stack);
        System.out.println("New size: "+stack.size());

    }
}
