package lesson5.problem4;

public class HourlyEmployee extends Employee{
    public double wage;
    public double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurity, double wage, double hours) {
        super(firstName, lastName, socialSecurity);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return super.toString()+"\nWage: "+wage+"\nHours worked: "+hours;
    }
}
