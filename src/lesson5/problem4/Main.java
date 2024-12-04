package lesson5.problem4;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new CommissionEmployee("Steve","Jobs", "123123", 100000, 7.2);
        employees[1] = new BasePlusCommissionEmployee("Stephen","Curry", "234234", 93000, 5, 2000);
        employees[2] = new HourlyEmployee("Lebron","James", "243980", 70, 40);
        employees[3] = new SalariedEmployee("Michael", "Jordan", "802109", 5000);
        employees[4] = new HourlyEmployee("Kobe","Bryant","473218", 80,40);

        for(Employee e:employees){
            System.out.println(e.toString());
            System.out.println();
        }

        System.out.println("The highest salary is:\n" + findMaxSalary(employees).toString());
    }
    public static Employee findMaxSalary (Employee[] col) {
        if(col == null || col.length == 0) throw new Error("Data empty");
        Employee highestPaid = col[0];

        for(Employee current: col){
            if(current.getPayment() >= highestPaid.getPayment()){
                highestPaid = current;
            }
        }

        return highestPaid;
    }
}
