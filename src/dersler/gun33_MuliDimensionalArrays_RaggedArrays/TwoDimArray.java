package dersler.gun33_MuliDimensionalArrays_RaggedArrays;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        System.out.println("Two dimensional array in Java.");

        int[][] matrix = new int[3][2];

        int[] satir1 = {2,56};
        int[] satir2 = {333,5346};
        int[] satir3 = {122,12};

        System.out.println(Arrays.toString(satir1)); //Tek boyutlu dizinin elemanlarını yazdıran metod

        matrix[0] = new int[]{12, 7};
        matrix[1] = satir2;
        matrix[2] = satir3;

        System.out.println(Arrays.toString(matrix[0]));

        System.out.println(Arrays.deepToString(matrix));

    }
    }

