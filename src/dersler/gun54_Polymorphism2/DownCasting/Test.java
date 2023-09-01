package dersler.gun54_Polymorphism2.DownCasting;

public class Test {
    public static void main(String[] args) {
        A obj = new B(); // Erisilebilirligi reference olan A belirliyor.
        obj.methodA();
       //  obj.methodB(); ERROR

        // Downcasting
        B obj2 = (B) obj; // B obj2 = new B();
        obj2.methodB();

        A obj3 = new C();
        obj3.methodA();

        B obj4 = (B) obj3; // obj3 A yi b ye downcasting yaptik
        obj4.methodA();
        obj4.methodB();


        C obj5 = (C) obj4;
        obj5.methodA();
        obj5.methodB();
        obj5.methodC();

        ///////////////////////

       /* Run time da hata verir
       Eger A reference B den olusturuldu ise asagi seviyedeki C ye cast edilemez
       A obj6 = new B();
        C obj7 = (C) obj6;
        obj7.methodA();
        obj7.methodB();
        obj7.methodC();

        */

        /*
        A
        B
        C
        D
        A obj = new D();
        Downcasting level: B,C,D

        A obj2 = new C();
        Downcasting level: B,C
        Not casting to D

        */

    }
}
