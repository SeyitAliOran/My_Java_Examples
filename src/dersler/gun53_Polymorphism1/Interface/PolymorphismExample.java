package dersler.gun53_Polymorphism1.Interface;

public class PolymorphismExample {
    public static void main(String[] args) {

        // Non-polymorphic way
        ClassA a = new ClassA();
        ClassB b = new ClassB();

        // Polymorphic way with Interface
        MyInterface obj1 = new ClassA();
        obj1.method(); // Method on ClassA

        // MyInterface obj2 = new MyInterface();

        MyInterface obj2 = new ClassB();
        obj2.method(); // Method on ClassB
    }
}
