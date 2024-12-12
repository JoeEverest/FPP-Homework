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
        if(front==rear){ //* reset positions
            front=-1;
            rear = 0;
        }
        return out;
    }

    public boolean isEmpty(){
        return front == -1 || size() == 0;
    } //* size()==0 maybe redundant

    public int size(){
        if(front == -1) return 0;
        return rear - front;
    }

    private void resize(){
        arr = Arrays.copyOf(arr, arr.length*2);

          //* Below code maybe memory efficient, more control over what is copied
//        int[] new_arr = new int[arr.length * 2];
//        System.arraycopy(arr, front, new_arr, 0, size());
//        front = 0;
//        rear = size();
//        arr=new_arr;
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
