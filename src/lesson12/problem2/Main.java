package lesson12.problem2;

public class Main {
    public static void main(String[] args) {
        CustomerAccount account = new CustomerAccount("John Doe", "12345", 500.0);

        System.out.println("Initial Balance: $" + account.getBalance());

        if (account.deposit(200)) {
            System.out.println("Deposit successful. New Balance: $" + account.getBalance());
        } else {
            System.out.println("Deposit failed.");
        }

        try {
            if (account.withdraw(300)) {
                System.out.println("Withdraw successful. New Balance: $" + account.getBalance());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(600);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(400);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
