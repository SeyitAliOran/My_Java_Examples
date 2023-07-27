package dersler.gun38_Constructors_PassingObjects2.Employee;

public class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayDetails(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
