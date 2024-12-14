package lesson11.Prob2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class EmployeeAdmin {

    /**
     * Your method prepareReport should return a list of all Employees in the input table
     * whose social security number is in the input list socSecNums and whose salary is greater than $80,000.
     * In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
     */
    public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
        List<Employee> out = new ArrayList<>();

        for (Employee emloyee : table.values()) {
            if (socSecNums.contains(emloyee.getSsn())) {
                if (emloyee.getSalary() > 80000) {
                    out.add(emloyee);
                }

            }
        }

        out.sort((e1, e2) -> e1.getSsn().compareTo(e2.getSsn()));

        //IMPLEMENT
        return out;

    }

}
