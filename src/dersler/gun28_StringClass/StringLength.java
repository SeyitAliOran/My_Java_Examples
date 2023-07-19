package dersler.gun28_StringClass;

public class StringLength {
    public static void main(String[] args) {
        String str = "Eurotech Study";

        System.out.println(str.length()); // Stringin icindeki karakter sayisini berlirtir.
        System.out.println();

        int uzunluk = str.length(); // str.length() int bir degere assingment edebiliyoruz...
        System.out.println("Int deger = " + uzunluk);
        System.out.println();

        String str2= "      "; // bosluklarda bir karaktere sahiptir...
        System.out.println("Bosluk sayisi = " + str2.length());
        System.out.println();

        String str3 = "";
        System.out.println("Bos string = " + str3.length());
        System.out.println();

        int carpim = str.length() *5; // int olarak dondurur ve bir isleme sokabiliriz...
        System.out.println("carpim = " + carpim);
    }
}
