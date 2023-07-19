package dersler.gun30_Array;

import java.util.Arrays;

public class PrintingArrayElements2 {
    public static void main(String[] args) {
        String[] isimler = {"Ahmet","Mehmet","Ayse"};
        // For Loop ile
        System.out.println("For loop...");
        for (int i = 0; i < isimler.length; i++) {
            System.out.println(isimler[i]);
        }
        System.out.println();
        // For each
        System.out.println("For each....");
        for (String isim:
                isimler) {
            isim = (isim.equals("Mehmet"))? isim.toUpperCase() : isim; // Mehmeti buyuk yazmak
            System.out.println(isim);
        }
        System.out.println();
        // Arrays to String ile
        System.out.println("Arrays.toString()");
        System.out.println(Arrays.toString(isimler));

        System.out.println();
        System.out.println("While loop");
        int index = 0;
        while (index < isimler.length){
            System.out.println(isimler[index]);
            index++;

        }
    }
}
