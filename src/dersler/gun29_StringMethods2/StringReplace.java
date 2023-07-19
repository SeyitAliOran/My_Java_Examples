package dersler.gun29_StringMethods2;

public class StringReplace {
    // replace de 2 string kullanilir.
    // 1. de degistirilmesini istedigimiz, 2. de degistirecegimiz String
    // silsile halinde degisiklikler yapilabolir....
    public static void main(String[] args) {
        String str = "Berlin is capital city of Germany";
        // String de bulunan butun Berlin kelimelerini Londan a cevirir...
        str  = str.replace("Berlin", "London").replace("Germany", "England");
        System.out.println("str = " + str);
        System.out.println(str.replace("i", "j")); // tum eslesen i karakterini degistirir.
        System.out.println(str.replaceFirst("i", "j")); // String de ki ilk i harfini j ye degistirir hepsini degil
        System.out.println();

        String email = "isim_soyisim@gmail.com";
        String company = "eurotechstudy";
        email = email.replace("gmail",company);
        System.out.println("email = " + email);
        System.out.println();

        String cumle = "Coding is fun, it is my hobby";
        System.out.println("cumle = " + cumle);
        cumle = cumle.replace(" ", ""); // cumle icinde ki bosluklari bu sekilde kaldirabiliriz.
        System.out.println("cumle = " + cumle);



    }
}
