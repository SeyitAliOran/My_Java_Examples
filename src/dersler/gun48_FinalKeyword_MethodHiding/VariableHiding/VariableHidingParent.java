package dersler.gun48_FinalKeyword_MethodHiding.VariableHiding;

public class VariableHidingParent {
    public String name = "Parent class Ä°sim";
    public int number = 12;

    public void displayName(){
        System.out.println("Parent class displayName()");
        System.out.println(name);
    }
    public void displayNumber(){
        System.out.println("Parent class displayNumber()");
        System.out.println(number);
    }
}
