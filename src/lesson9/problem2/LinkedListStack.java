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
        Node new_node = new Node(x);  // lets call it new_node, data little confusing :)

        if (front == null) {
            front = new_node;
            rear = new_node;
        }
        else{
            rear.next = new_node;
            rear = new_node;
        }
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
        Integer ret = peek(); // return type Integer in peek
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
           sb.append(current.data);
           if (current.next != null) {
               sb.append(", ");  // comma only if there is another node
           }
           current = current.next;
       }
       sb.append("]");

       return sb.toString();
    }
}
