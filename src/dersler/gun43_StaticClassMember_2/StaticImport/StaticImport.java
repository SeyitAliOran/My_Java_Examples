package dersler.gun43_StaticClassMember_2.StaticImport;
import static java.lang.Math.*; // static olarak import ediyoruz bu nedenle tekrar tekrar Math yazmaya gerek yok


public class StaticImport {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(81)); // static oldugu icin import etmeden dogrudan yapabiliriz
        System.out.println(sqrt(81)); // Math classini static olarak import ettikten sonra tekrar tekrar Math yazmaya gerek kalmiyor
        System.out.println(PI); // Math.PI iken biz direkt PI olarak cagiriyoruz
    }
}
