package dersler.gun44_Inheritance1.Employee;

public class Lawyer extends Employee { // extends ile super sub iliskisi yada parent child iliskisi yapiyruz. Miras alma islemi
    // Lawyer --- Child,,,,,, Employee --- Parent
    String caseName;
    String caseStatus;

    public void joinCourt(){
        System.out.println("Lawyer is joining court");
    }
    public void submitClaim(){
        System.out.println("Lawyer is submitted a claim");
    }
}
