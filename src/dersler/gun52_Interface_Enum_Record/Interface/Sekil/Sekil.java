package dersler.gun52_Interface_Enum_Record.Interface.Sekil;

public interface Sekil {
    // Attributes, properties, fields ---> public static final
    // Interface variables / Constants are by default " public static final". (Interface uyeleri icin  public static final atama yapmaya gerek yok)
    // Interface icerisinde ki methodlar Overloading yapilabilir.
    // Interface lerde birden fazla sub class interface alabilir
    // Interface ler implements ile yapilir.
    double PI = 3.14; // public static final double PI = 3.14; yazmis oluyoruz aslinda
    int MAX_WIDTH = 100;
    int MAX_LENGTH = 100;
    // private int number; --> Not allowed
    // public  sekil(){ } ---> Interface lerin constructor lari yoktur

    // Abstract methods -- must be implemented by sub classes

    void draw(); // aslinda public abstract void draw(); dir
    double getArea(int en,int boy);
    double getArea();
    double getPerimeter();


    // Static method - After Java 9
    static void merhabaStatic(){ // static methods can not override
        System.out.println("Merhaba. Ben interface'in static methoduyum");
    }
    private void privateMethod(){  // private methoda sadece bu classin icindeki methodlar ulasabilir.
        System.out.println("Merhaba. Ben interface'in private methoduyum");
    }
    default void drawDefault(){ // default sadec Interface'de yazilir
        System.out.println("Merhaba. Ben interface'in default methoduyum");
    }

}
