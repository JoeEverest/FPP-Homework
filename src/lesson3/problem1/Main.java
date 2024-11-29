package lesson3.problem1;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("123 Main St", "Chicago", "IL", "60601");
        Address address2 = new Address("456 Oak St", "New York", "NY", "10001");
        Address address3 = new Address("789 Pine St", "Chicago", "IL", "60605");

        Customer customer1 = new Customer("William", "Smith", "3322214444");
        customer1.setBillingAddress(address1);
        customer1.setShippingAddress(address1);

        Customer customer2 = new Customer("Stephan", "Curry", "1112233333");
        customer2.setBillingAddress(address2);
        customer2.setShippingAddress(address2);

        Customer customer3 = new Customer("John", "Snow", "4445556666");
        customer3.setBillingAddress(address3);
        customer3.setShippingAddress(address3);

        Customer[] customers = {customer1, customer2, customer3};

        for (Customer customer : customers) {
            String city = customer.getBillingAddress().getCity();
            if (city.equals("Chicago")) {
                System.out.println(customer);
            }
        }
    }
}
