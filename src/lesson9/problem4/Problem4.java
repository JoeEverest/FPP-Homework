package lesson9.problem4;

public class Problem4 {
    public static void main(String[] args) {
        TicketingSystem system = new TicketingSystem();

        system.createTicket("Issue with login");
        system.createTicket("Payment not processed");
        system.createTicket("Bug in the mobile view");

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
