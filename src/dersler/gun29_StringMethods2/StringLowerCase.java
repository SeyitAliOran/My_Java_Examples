package dersler.gun29_StringMethods2;

public class StringLowerCase {
    // parametre almaz
    //  String de ki butun karakterleri  kucuk harfe cevirir.
    // Biz tekrar string donderir...
    public static void main(String[] args) {
        String str = "HelLO WoRld";
        System.out.println(str.toLowerCase());
        String word2 = "adaksjdOÖIJKJALKDJFkljfkaljkljalLKJALF";
        System.out.println("word2 = " + word2);
        System.out.println(word2.toLowerCase());
        String word3 = "123%&/%&/%&/%&aslkdhlaksdlkasdlas";
        System.out.println("word3 = " + word3);
        System.out.println(word3.toLowerCase());

    }
}
