package dersler.gun33_MuliDimensionalArrays_RaggedArrays;

import java.util.Arrays;

public class TwoDimArrayPrintMethod {
    public static void printArray(double[][] dizi){
        System.out.println("Array print metodu...");
        for (double[] sayilar:dizi) {
            for (double sayi:sayilar){
                System.out.print(sayi + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[][] dizi){
        System.out.println("int type Array print");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(String[][] str){
        System.out.println(Arrays.deepToString(str));
    }

    public static void main(String[] args) {
        double[][] doubleSayilar = new double[3][3]; //Declaring with default values
        printArray(doubleSayilar);
        System.out.println();

        int[][] intSayilar = new int[10][5]; //Declaring with default values
        printArray(intSayilar);

        System.out.println();
        //String[][] strings = new String[3][2]; //Declaring with default values
        String[][] strings = {
                {"Ahmet","Mehmet"},
                {"Hasan","Veli"},
                {"John","Merry"}}; //Assigning initial values
        printArray(strings);
    }
}
