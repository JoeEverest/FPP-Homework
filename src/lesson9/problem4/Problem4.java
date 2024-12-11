package lesson9.problem4;

public class Problem4 {
    public static void main(String[] args) {
        TicketingSystem system = new TicketingSystem();

        system.addTicket("Issue with login");
        system.addTicket("Payment not processed");
        system.addTicket("Bug in the mobile view");

        System.out.println("Number of open tickets: "+system.size());
        System.out.println("All tickets:\n"+system);
        System.out.println();

        System.out.println("First ticket: " + system.viewNextTicket());

        // Process tickets
        while (!system.isEmpty()) {
            System.out.println("Processing ticket: " + system.processTicket());
        }

        // Check if queue is empty
        if (system.isEmpty()) {
            System.out.println("All tickets processed");
        }
    }
}
