package lesson9.problem1;

import org.junit.Test;

import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();

        System.out.println("q is empty? "+q.isEmpty());

        for (int i = 0; i < 10; i++) {
            q.enqueue(new Random().nextInt(10, 100));
        }
        
        System.out.println("Initial State: " + q);
        System.out.println("Size: "+q.size());

        System.out.println("Value the front is "+q.peek());

        System.out.println("Process the first 5");
        for (int i = 0; i <5 ; i++) {
            q.dequeue();
            System.out.println(q);
        }

        System.out.println("After processing, the size is "+q.size());
    }
}
