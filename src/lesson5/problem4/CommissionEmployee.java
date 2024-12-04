package lesson5.problem4;

public class CommissionEmployee extends Employee{
    public double grossSales;
    public double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurity, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurity);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPayment() {
        return grossSales * (commissionRate /100);
    }

    @Override
    public String toString() {
        return super.toString()+"\nGross Sales: "+grossSales+"\nCommission Rate: "+commissionRate;
    }
}
