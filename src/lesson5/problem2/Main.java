package lesson5.problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Professor prof1 = new Professor("Jim Johns", 12000, "2012", "01", "13", 13);
        Professor prof2 = new Professor("Rebecca Patrick", 10000, "2015", "03", "23", 9);
        Professor prof3 = new Professor("Sushil Nova", 15000, "2009", "08", "29", 4);


        Secretary secretary1 = new Secretary("Pabin Camara", 9000, "2017", "12", "04", 24.5);
        Secretary secretary2 = new Secretary("Sarah Parker", 8000, "2022", "09", "24", 19);

        DeptEmployee[] employees = new DeptEmployee[5];
        employees[0] = prof1;
        employees[1] = prof2;
        employees[2] = prof3;
        employees[3] = secretary1;
        employees[4] = secretary2;

        System.out.print("Do you want to see the sum of all salaries? (Y or N): ");
        Scanner input = new Scanner(System.in);
        String res = input.next();
        System.out.println();

        if(res.equals("Y")){
            getTotalSalaries(employees);
        }else{
            System.out.println("Good bye");
        }

    }

    public static void getTotalSalaries(DeptEmployee[] employees){
        double totalSalaries = 0;
        for (DeptEmployee em: employees){
            System.out.println(em.name+": "+em.computeSalary());
            totalSalaries += em.computeSalary();
        }

        System.out.println("The total salaries are: " + totalSalaries);
        System.out.println("The average salary is: " + totalSalaries/employees.length);
    }
}
