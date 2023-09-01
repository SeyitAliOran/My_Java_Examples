package dersler.gun54_Polymorphism2.ReferenceType;

import javax.print.CancelablePrintJob;

public class TestClass {
    public static void main(String[] args) {
        ChildA childA = new ChildA();
        childA.method1(); // Parent ten gelen method
        childA.method2();
        childA.method3();

        ChildB childB = new ChildB();
        childB.method1(); // Parent ten gelen method
        childB.method2();
        childB.method4();

        Parent parent = new ChildA();
        parent.method1();

        Parent parent1 = new ChildB();
        parent1.method1();

        MyInterface myInterface = new ChildA();
        myInterface.method2(); // childA daki override edilen methoda ulasilir.

        MyInterface myInterface1 = new ChildB();
        myInterface1.method2(); // childB deki override edilen methoda ulasilir.



    }
}
