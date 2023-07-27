package dersler.gun35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTraverse {
    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("Mehmet", "Ali", "Ahmet", "Hasan", "Ali", "Melike"));

        // For loop
        System.out.println("For .... loop....");
        for (int i = 0; i < isimler.size(); i++) {
            System.out.println("index = " + i + "-" + isimler.get(i));
        }
        System.out.println();
        // FOr each
        System.out.println("For .... each....");
        int index1 = 0;
        for (String eleman : isimler) {
            System.out.println("index = " + index1 + "-" + eleman);
            index1++;
        }
        System.out.println();
        //While loop
        System.out.println("While....loop.....");
        int i = 0;
        while (i < isimler.size()) {
            System.out.println("index = " + i + "-" + isimler.get(i));
            i++;
        }
    }
}
