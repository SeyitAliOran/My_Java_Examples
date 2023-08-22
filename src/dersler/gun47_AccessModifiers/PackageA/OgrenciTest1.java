package dersler.gun47_AccessModifiers.PackageA;

import dersler.gun47_AccessModifiers.Constructor.Ogrenci;
import dersler.gun47_AccessModifiers.Constructor.OgrenciTest;

public class OgrenciTest1 {
    public static void main(String[] args) {
      //  Ogrenci ogrenci = new Ogrenci(); --> ders47 de ki ogrenci classinda ki constructor public olmadigi icin diger package den erisim saglanmaz
        Ogrenci ogrenci = new Ogrenci("Seyit ali", "oran"); // --> ders47 de ki ogrenci classinda ki constructor public oldugu icin erisim saglanir.


    }
}
