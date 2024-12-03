package lesson5.problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DeptEmployee {
    String name;
    double salary;
    LocalDate hireDate;

    public DeptEmployee(String name, double salary, String year, String month, String day) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.parse(year+"-"+month+"-"+day, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double computeSalary(){
        return this.salary;
    }
}
