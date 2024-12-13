package lesson9.problem1;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int obj) {
        if (isEmpty()) {
            front = 0; // Initialize front when the queue is empty
        }
        if (rear == arr.length) {
            resize();
        }
        arr[rear] = obj;
        rear++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int out = arr[front];
        front++;
        if (front == rear) { // Reset positions when the queue is empty
            front = -1;
            rear = 0;
        }
        return out;
    }

    public boolean isEmpty() {
        return front == -1; // Simplified logic
    }

    public int size() {
        if (isEmpty()) return 0; // Handle the edge case for an empty queue
        return rear - front;
    }

    private void resize() {
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, front, newArr, 0, size());
        rear = size();
        front = 0;
        arr = newArr;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = front; i < rear; i++) {
            sb.append(arr[i]);
            if (i < rear - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
