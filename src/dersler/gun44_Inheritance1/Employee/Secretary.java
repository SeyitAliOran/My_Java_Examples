package dersler.gun44_Inheritance1.Employee;

public class Secretary extends Employee{ // extends ile super sub iliskisi yada parent child iliskisi yapiyruz. Miras alma islemi
    // Secretary --- Child,,,,,, Employee --- Parent
    String officeName;
    int managerId;

    public void giveReport(){
        System.out.println("Secretary is giving report");
    }
    public void createList(){
        System.out.println("Secretary created a list");
    }
}
