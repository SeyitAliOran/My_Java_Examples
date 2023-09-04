package dersler.gun55_Review.Interface.Interface;

public interface Sekil {
    // Interface ler de ki butun degiskenler otomatik olarak public final static alir bu nedenle yazmaya gerek yok
     int MAX_SIZE = 100; // Final oldugu icin ve interface'in constructri ve int blogu olmadigi icin hemen deger atamak zorundayiz
     String DEFAULT_NAME = "Joe Doe";


    // public Sekil(){ } --> Interface ler de Constructor olusturulamaz

    // BUtun methodlar public abstract methodlardir. Bu nedenle yazilmasina gerek kalmaz
    // Interface lerde butun methodlar public olmak zorundadir.Private veya digerleri ile kullanilamaz
    // Interface ler Final veya Static olamaz
    // final void myMethod2();
    // static void myMethod2();

    // Abstract method
    void myMethod(); // Butun methodlar public abstract methodlardir. Bu nedenle yazilmasina gerek kalmaz


    // Java 8 ile birlikte body li methodlar olusturulabiliyor fakat DEFAULT
    // (access modifier degil - fabrika cikisi anlaminda) kullanmak gerekiyor.
    default void myMethod4(){
        // implementasyon
    }

    static void myMethod5(){ // Java 8 ile birlikte STATIC eklenerek body li methodlar kullanilabilir.
        // static implementasyon
    }

    default void myMethod6(){ // Bu sekilde ayni class icinden private methoda ulasabiliriz
        myMethod7();
    }

    private void myMethod7(){ // Java 9 ile birlikte PRIVATE eklenerek body li methodlar kullanilabilir.
        // private implementasyon
    }

}
