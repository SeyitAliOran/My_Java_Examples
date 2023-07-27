package dersler.gun38_Constructors_PassingObjects2.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Department hrDept = new Department("Human Resources","London");
        Address hrAddress = new Address("Oxford Road", "London", "Greather London","LD123");

        Department itDept = new Department("Information Technology","Manchester");
        Address itAddress = new Address("Liverpool Road", "Manchester", "Greather Manchester","GH145");

        Employee employee1 = new Employee("Ahmet",33);
        Employee employee2 = new Employee("Ayse",40);
        Employee employee3 = new Employee("Hatice",36);

        hrDept.addEmployee(employee1);
        hrDept.addEmployee(employee2);
        itDept.addEmployee(employee3);
        itDept.addEmployee(new Employee("Ali",21)); // bu sekilde de parametre Assing edebiliriz

        System.out.println(hrDept.getDepartmentInfo());
        System.out.println(hrAddress.getFullAddress());
        hrDept.displayEmployees();
        System.out.println("\n-----------------------------------------------------------\n");
        System.out.println(itDept.getDepartmentInfo());
        System.out.println(itAddress.getFullAddress());
        itDept.displayEmployees();

    }
}
