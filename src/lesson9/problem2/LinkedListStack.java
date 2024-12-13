package lesson9.problem2;

public class LinkedListStack {
    class Node {
        int data;
        Node next;

        Node(int num) {
            data = num;
        }
    }

    Node top;
    int count;

    public void push(Integer x) {
        Node newNode = new Node(x);
        newNode.next = top; 
        top = newNode;
        count++;
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        int ret = top.data;
        top = top.next;
        count--;
        return ret;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = top;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
