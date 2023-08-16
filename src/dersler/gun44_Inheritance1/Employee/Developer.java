package dersler.gun44_Inheritance1.Employee;

public class Developer extends Employee { // extends ile super sub iliskisi yada parent child iliskisi yapiyruz. Miras alma islemi
    // Developer --- Child,,,,,, Employee --- Parent
    String projectName;
    String mainLang;

    public void releaseCode(){
        System.out.println("Developer released code");
    }
}
