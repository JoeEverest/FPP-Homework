package lesson12.problem2;

public class CustomerAccount {
    String Cus_name, Acc_No;
    double balance;

    public CustomerAccount(String cus_name, String acc_No, double balance) {
        Cus_name = cus_name;
        Acc_No = acc_No;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) return false;

        balance = balance+amount;
        return true;
    }

    public boolean withdraw(double amount) throws AccountBalanceException {
        if (amount <= 0) return false;
        if (amount > balance) {
            throw new AccountBalanceException("You can't withdraw more than you have");
        }

        balance = balance - amount;

        return true;
    }

    public double getBalance() throws AccountBalanceException {
        if(balance < 100) throw new AccountBalanceException("Your balance is getting low");
        return balance;
    }
}
