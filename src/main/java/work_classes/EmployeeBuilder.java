package work_classes;

import java.util.ArrayList;

public class EmployeeBuilder {

    static String Employee;

    EmployeeBuilder() {
    }

    String CreateEmployee() {
        ArrayList<String> employees = new ArrayList();
        employees.add(0, "Agafiev");
        employees.add(1, "Antonov");
        employees.add(2, "Borisov");
        employees.add(3, "Viktorov");
        employees.add(4, "Georgiev");
        employees.add(5, "Danilov");
        employees.add(6, "Egorov");
        employees.add(7, "Zikker");
        employees.add(8, "Ivanov");
        employees.add(9, "Kozlov");
        Employee = (String) employees.get(0 + (int) (Math.random() 
                * (double) employees.size()));
        return Employee;
    }
}
