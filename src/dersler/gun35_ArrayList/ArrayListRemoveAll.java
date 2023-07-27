package dersler.gun35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveAll {
    public static void main(String[] args) {
        // removeALl() metodu ile 1 den fazla silme islemi yapilabilir
        // eger silinecek eleman listede yoksa hata vermez
        System.out.println(".removeAll() metodu...");
        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("Ahmet","Mehmet","Hasan","Ayse","Kadir"));
        ArrayList<String> isimler2 = new ArrayList<>(Arrays.asList("Ahmet","Mehmet"));
        System.out.println(isimler);
        //isimler.removeAll(Arrays.asList("Ahmet","Ayse"));
       // System.out.println(isimler);
        isimler.removeAll(isimler2); // isimler listesinden isimler2 deki ile ayni olan isimleri siler...
        System.out.println(isimler);
    }
}
