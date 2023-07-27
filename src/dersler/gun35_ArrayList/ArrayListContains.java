package dersler.gun35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListContains {
    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("Mehmet","Ali","Hasan","Kemalettin","Ali","Melike"));
        boolean varMi = isimler.contains("Mehmet"); // Eger eleman ArrayListe varsa true yoksa false donderir.
        if (varMi){
            System.out.println("Mehmet lsitede var");
        }else System.out.println("listede yok");

    }
}
