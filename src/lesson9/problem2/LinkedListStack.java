package lesson9.problem2;

public class LinkedListStack {
    class Node {
        int data;
        Node next;

        Node(int num) {
            data = num;
        }
    }

    Node front, rear;
    int count;

    public void push(Integer x) {
        Node data = new Node(x);

        if (front == null) {
            front = data;
            rear = data;
            front.next = null;
            count++;
            return;
        }
        if (front == rear) {
            front.next = data;
            rear = data;
            rear.next = null;
            count++;
            return;
        }
        //old rear
        rear.next = data;
        // new rear is current data
        rear = data;
        // set next for new rear
        rear.next = null;

        count++;
    }

    public Integer peek() {
        if(isEmpty()){
            return null;
        }
        return front.data;
    }

    public Integer pop() {
        if(isEmpty()){
            return null;
        }
        int ret = peek();
        front = front.next;
        count--;
        return ret;
    }
    public boolean isEmpty(){ // true if stack is empty
        return front == null;
    }

    public int size(){ // returns number of items in the stack
        return count;
    }

    @Override
    public String toString() {
       if(front == null) return "Empty";
       StringBuffer sb = new StringBuffer("[");

       Node current = front;
       while (current != null){
           sb.append(current.data).append(", ");
           current = current.next;
       }
       sb.append("\b\b]");

       return sb.toString();
    }
}
