package dersler.gun29_StringMethods2;

public class StringTrim {
    // parametre kabul etmez
    // Stringin onunde ki ve arkasinda ki bosluklari siler
    public static void main(String[] args) {
        String str = "       Hello    World      ";
        System.out.println(str);
        System.out.println(str.trim()); // arada  ki bosuklari kaldirmaz....
        System.out.println(str.trim().replace(" ", "")); // bu sekilde de butun bosluklar kaldirilir.


    }
}
