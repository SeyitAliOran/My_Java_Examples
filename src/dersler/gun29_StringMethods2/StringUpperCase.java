package dersler.gun29_StringMethods2;

public class StringUpperCase {
    // parametre almaz
    //  String de ki butun karakterleri  buyuk harfe cevirir.
    // Biz tekrar string donderir...
    public static void main(String[] args) {
        String str = "HelLO WoRldir";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println();

        String word2 = "adaksjdOÖIJKJALKDJFkljfkaljkljalLKJALF";
        System.out.println("word2 = " + word2);
        System.out.println(word2.toUpperCase());
        System.out.println();
        String word3 = "123%&/%&/%&/%&aslkdhlaksdlkasdlas";
        System.out.println("word3 = " + word3);
        System.out.println(word3.toUpperCase());
    }
}
