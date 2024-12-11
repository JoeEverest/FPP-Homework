package lesson9.problem1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        };
        return arr[front];
    }

    public void enqueue(int obj){
        if(isEmpty()){
            front++;
        }
        if(rear == arr.length){
            resize();
        }
        arr[rear] = obj;
        rear++;
    }

    public int dequeue() {
        int out = peek();
        front++;

        return out;
    }

    public boolean isEmpty(){
        return front == -1 || size() == 0;
    }

    public int size(){
        if(front == -1) return 0;
        return rear - front;
    }

    private void resize(){
        arr = Arrays.copyOf(arr, arr.length*2);
    }

    @Override
    public String toString(){
        if(isEmpty()) return "";
        StringBuilder sb = new StringBuilder("[");
        for (int i = front; i < rear; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append("\b\b]");

        return sb.toString();
    }
}
