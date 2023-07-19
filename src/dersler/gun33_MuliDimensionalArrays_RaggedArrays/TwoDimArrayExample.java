package dersler.gun33_MuliDimensionalArrays_RaggedArrays;

import java.util.Arrays;

public class TwoDimArrayExample {
    public static void main(String[] args) {
        int[][] sayilar = new int[3][5];
        sayilar[1][3] = 2; // Assigning value to two dim array sayilar[row][column]

        System.out.println("Nested for loop ile multi-dim array elemanlarını yazdırma");
        //outer for loop traverse rows of the Array
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(i+1 + ".satır = ");
            //inner for loop traverse columns of the row
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Arrays.deepToString() metodu ile multi-dim array elemanlarını yazdırma");
        System.out.println(Arrays.deepToString(sayilar));

        System.out.println();
        System.out.println("For each loop ile multi-dim array elemanlarını yazdırma");

        for (int[] satir:sayilar){
            for (int sutun:satir){
                System.out.print(sutun + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Arrays.toString() metodu ile tek boyutlu dizinin elemanlarını yazar

        for (int[] satir : sayilar){
            System.out.println(Arrays.toString(satir));
        }

    }
}
