package dersler.gun28_StringClass;

public class StringClass {
    public static void main(String[] args) {
        // String 2 farkli yontem ile olusuturulur.

        // 1. Yöntem Heap Memory nin icinde String pool un icinde saklanir
        String s = "Hello";
        System.out.println("s = " + s);

        // 2. Yöntem - new Keyword Heap Memory de saklanir.
        String s2 = new String("Hello");
        System.out.println("s2 = " + s2);

       // '==' operator kullanarak String karsilastirma
        // ==' operator String karsilastirmasi yaparken objcet degerlerini degil
        //     ayni objecti declare edip etmedigini karsilastiriyor...
        System.out.println();
        String str1 = new String("EurotechStudy");
        String str2 = "EurotechStudy";
        String str3 = "EurotechStudy";
        String str4 = new String("EurotechStudy");

        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // false
        System.out.println(str2 == str3); // true sadece str2 ve str3 String pool da ayni object refere ettigi icin TRUE alir
        System.out.println(str2 == str4); // false
        System.out.println(str3 == str4); // false

    }

}
