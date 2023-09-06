package Replit.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("ali","oran",2000);
        Employee employee2 = new Employee("Mehmet","dizlek",1000);
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee1.raise());
        System.out.println(employee2.raise());


    }
}
