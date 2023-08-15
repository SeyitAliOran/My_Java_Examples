package dersler.gun43_StaticClassMember_2.Instance_Static;

public class StaticMethods {
    // Static method da yeniden object olsturmaya gerek yok
    // Static method da this kullanilmaz
    // Static methodun icerine instance method cagirilamaz ama instance a static method cagirilabilir.
    static String name= "Ahmet"; // static variable hem static hem de instance methodda cagirilabiliyor...
    public static void show1(){
       // show2(); // Can not call instance methods from a static method
        show4(); // Can call static method from a static method
        System.out.println(name);
    }
    public void show2(){
        show1(); // Can call a static method from an instance method
        show3(); // Can call an instance method from an instance method
        System.out.println(name);
    }
    public void show3(){
        show2(); // Can call a static method from an instance method
        show1(); // Can call an instance method from an instance method
    }
    public static void show4(){
        show1(); // Can call static method from a static method7
        // show3(); // Can not call instance methods from a static method
    }

}
