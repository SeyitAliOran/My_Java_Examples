package dersler.gun48_FinalKeyword_MethodHiding;

public class FinalVariable {

    public static void main(String[] args) {
        FinalVariable obj1 = new FinalVariable(); // Non static block ve constructor calisir
        System.out.println("obj1.number1 = " + obj1.number1);
        // obj1.number1 = 12312; --> number1 final olarak tanimlandigi ve baslangic deger atamasi yapildigi icin sonradan degistirilemez.
        System.out.println("obj1.krediHesapla(100) = " + obj1.krediHesapla(100,10));


    }

 /*
    Decleration and assignment - Tanimlama ve ilk deger atama
    -- Same statement -->
    -- constructors -->
    -- init block -->
     */
    // method icerisinde final degiskenlere deger atamasi yapilamaz

    // final anahtar kelimesi kullanarak tanimlanan degiskene CONSTANT yani sabit diye adlandiriliyor
    public final int number1 = 123; // -- Same statement
    final int number2; // Declaration --
    final int number3; // Declaration
    final int number4;

    // Best practices naming convention on final variable -- Final degisken tanimlamasi yapilirken en yaygin isimlendirme7
    // final degisken ismi genel olarak buyuk harf ile yapilir.Eger birden fazla kelime varsa alt tre ile ayrilir
    final double PI = 3.14;
    final double KDV_18 = 0.18;
    final double KDV_10 = 0.10;
    final double TUKETICI_KREDISI_ORANI = 0.95;
    final double KONUT_KREDISI_FAIZ_ORANI = 1.38;

    // Init block non static
    {
        // Within init block final variables can be assigned initial values
        // Baslangic blognun icinde baslangic deger atanabilir
        System.out.println("Initialization block invoked.");
        number4 = 123124;
        number3 = 12312;
        System.out.println("number4 = " + number4);
        System.out.println("number3 = " + number3);
    }

    // Constructor
    FinalVariable(){
        System.out.println("Constructor invoked");
        number2 = 3456;
        System.out.println("number2 = " + number2);
        //  number1 = 12; -->  baslangic degeri atanan final degiskene tekrar deger atamasi yapamayiz...
    }

    //Method
    public void birMethod(){
        //  number3 = 1231; --> method icerisinde final degiskenlere assignment yapilamaz
    }
    public double krediHesapla(double miktar, int ay){
        double aylikFaizTutari = miktar * KONUT_KREDISI_FAIZ_ORANI/100;
        return (aylikFaizTutari * ay) + miktar;
    }
}
