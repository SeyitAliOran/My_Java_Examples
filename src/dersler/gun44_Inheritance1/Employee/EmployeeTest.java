package dersler.gun44_Inheritance1.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Ahmet";
        employee.employeeId = 32234;
        employee.salary = 50.000;
        employee.leaveHoliday(22);

        Developer developer = new Developer();
        developer.name = "Osman";
        developer.employeeId = 12345;
        developer.salary = 40000;
        developer.projectName = "BankPrject";
        developer.leaveHoliday(10);
        developer.releaseCode();

        Lawyer lawyer = new Lawyer();
        lawyer.name = "Ayse";
        lawyer.employeeId = 6789;
        lawyer.salary = 30000;
        lawyer.caseName = "Case123";
        lawyer.leaveHoliday(15);
        lawyer.joinCourt();

        Secretary secretary = new Secretary();
        secretary.name = "Ali";
        secretary.employeeId = 1653;
        secretary.salary = 20000;
        secretary.officeName = "HR";
        secretary.leaveHoliday(15);
        secretary.giveReport();
    }
}
