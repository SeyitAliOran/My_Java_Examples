package dersler.gun53_Polymorphism1.RunTimePoly;

public class RunTimePolyTest {
    public static void main(String[] args) {

        // Run Time Polymorphism / Dynamic Polymorphism / Method Overriding

        Parent obj = new Parent();
        obj.print(); // Print in Parent Class

        Child1 obj2 = new Child1();
        obj2.print(); // Print on Child1 Class
        Child2 obj3 = new Child2();
        obj3.print(); // Print on Child2 Class

    }
}
