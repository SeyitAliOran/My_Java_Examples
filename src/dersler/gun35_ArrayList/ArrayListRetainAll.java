package dersler.gun35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRetainAll {
    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("Ahmet","Mehmet","Hasan","Ayse","Kadir"));
        ArrayList<String> isimler2 = new ArrayList<>(Arrays.asList("Ahmet","Hasan","Ayse","Sinan"));

        //retainAll metodu ile iki listeyi karsilastirip iclerindeki ayni olanlari yazdirir...
        System.out.println(isimler.retainAll(isimler2));
        System.out.println(isimler);
    }
}
