package dersler.gun48_FinalKeyword_MethodHiding;

public class StaticVariables {
    // Static anahatar kelimesi ile olusturulan degiskenlerdir
    // Sadece class a ait degiskenlerdir.
    public static String okulAdi; // Static/Class Variable
    public String name; // Instance/Object -- örnek-nesne degiskeni


    static{
        okulAdi = "Static blok okulu";
    }

    // No-args Constructor
    public  StaticVariables(){
        name = "Ali Veli"; // Constructor icerisinde degiskene deger atayabiliyoruz.
        okulAdi ="Static Constructor okul"; // Bu Class'a ait oldugundan static degislene veri Constructor icerinde atamasi yapilabilir.
        // static int okulNo; --> Constructor icerisinde Static degisken tanimlanamaz
    }


    //Method
    public void method(){
        okulAdi = "Static Method Okulu"; // bir method icerisinde static degiskene deger atanabilir.
       // static String str; --> Method icerisinde Static degisken tanimlanamaz
    }

    public static void main(String[] args) {
        System.out.println(StaticVariables.okulAdi);  // Static blok okulu
        StaticVariables obj1 = new StaticVariables();
        System.out.println(StaticVariables.okulAdi); // Static Constructor okul
        obj1.method();
        System.out.println(StaticVariables.okulAdi); // Static Method Okulu
        StaticVariables obj2 = new StaticVariables();
        System.out.println("obj2.okulAdi = " + obj2.okulAdi); // obj2.okulAdi = Static Constructor okul
    }

}
