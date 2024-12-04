package lesson5.problem4;

public class SalariedEmployee extends Employee {
    public double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurity, double weeklySalary) {
        super(firstName, lastName, socialSecurity);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString()+"\nWeekly Salary: "+weeklySalary;
    }
}
