package lesson9.problem4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    Queue<Ticket> ticketQueue;
    int nextId;

    public TicketingSystem() {
        ticketQueue = new LinkedList<>();
        nextId = 1;
    }

    public void addTicket(String description){
        if(description == null || description.isEmpty()) return;
        Ticket t = new Ticket(nextId++, description);
        ticketQueue.add(t);
    }

    public Ticket processTicket(){
        if(ticketQueue.isEmpty()) return null;
        return ticketQueue.poll();
    }

    public Ticket viewNextTicket(){
        if(ticketQueue.isEmpty()) return null;
        return ticketQueue.peek();
    }

    public boolean isEmpty(){
        return ticketQueue.isEmpty();
    }

    @Override
    public String toString(){
        if(isEmpty()) return "No tickets available";
        StringBuffer sb = new StringBuffer("[");

        Queue<Ticket> t = ticketQueue;
        for (int i = 0; i < ticketQueue.size(); i++) {
            sb.append("\n").append(ticketQueue.poll()).append(", ");
        }
        sb.append("\b\b\n]");
        return sb.toString();
    }
}
