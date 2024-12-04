package lesson5.problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    public double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurity, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurity, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return super.getPayment() + baseSalary;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBase Salary: "+baseSalary;
    }
}
