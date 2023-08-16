package dersler.gun44_Inheritance1.Employee;

import dersler.gun40_Encapculation_2.HomeWork.Araba;

public class Employee {
    String name;
    double salary;
    int employeeId;
    int workHours;
    int vacationDay;
    char gender;
    public void raiseSalary(){
        System.out.println("Applied for raise salary");
    }
    public void leaveHoliday(int dayNumber){
        System.out.println("Asked leave for "+ dayNumber);
    }
    public void resign(){
        System.out.println("Asked leave for resing ");
    }
}
