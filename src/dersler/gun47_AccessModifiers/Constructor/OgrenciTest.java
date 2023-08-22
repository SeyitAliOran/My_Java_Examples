package dersler.gun47_AccessModifiers.Constructor;

public class OgrenciTest {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.schoolNo= 123; // schoolNo default oldugu icin getter ve setter olmadigi halde erisim saglanir

        Ogrenci ogrenci1 = new Ogrenci("ahmet","ozsoy",123); // Protected oldugundan ayni class yada ayni packageden erisime izin verilir
        Ogrenci ogrenci2 = new Ogrenci("Seyit ali", "oran");// --> ogrenci classinda ki constructor public oldugu icin erisim saglanir.


    }
}
