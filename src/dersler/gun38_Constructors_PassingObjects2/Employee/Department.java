package dersler.gun38_Constructors_PassingObjects2.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Department {
    String name;
    String location;
    ArrayList<Employee> employees;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
        this.employees = new ArrayList<>();
    }
    public String  getDepartmentInfo(){
        return "Department: " + name + ", " + "Location: " + location;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void displayEmployees(){
        System.out.println("Employees in " + name);
        int counter = 0;
        for (Employee employee: employees) {
            counter++;
            System.out.println("Employee: " + counter);
            employee.displayDetails();
            System.out.println("\n");
        }
    }
}
