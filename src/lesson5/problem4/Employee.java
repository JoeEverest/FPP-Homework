package lesson5.problem4;

abstract public class Employee {
    String firstName;
    String lastName;
    String socialSecurity;

    public abstract double getPayment();

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nSocial Security: " + socialSecurity+"\nPayment: "+getPayment();
    }

    public Employee(String firstName, String lastName, String socialSecurity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }
}
