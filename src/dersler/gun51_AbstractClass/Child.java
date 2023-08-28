package dersler.gun51_AbstractClass;

public class Child extends Parent{
    //Chil class Parent ve GrandParenti abstract oldugundan dolayi onlardaki abstract methodlari implement etmek zorunda
    // 2 abstract class inheritance yapilabilir ve iclerinde ki abstract methodlari implement etmek zorunda degiller
    @Override
    void grandParentMethod() {
        System.out.println("GrandParent method");

    }

    @Override
    void parentMethod() {
        System.out.println("Parent method");

    }
}
