package dersler.gun33_MuliDimensionalArrays_RaggedArrays;

import java.util.Arrays;

public class RaggedArrays {
    public static void main(String[] args) {
        int[][] sayilar = new int[3][];

        sayilar[0] = new int[]{1, 2, 3, 4, 5};
        sayilar[1] = new int[]{1, 5, 6};
        sayilar[2] = new int[2];
        sayilar[2][0] = 34;
        sayilar[2][1] = 1234;

        System.out.println(Arrays.deepToString(sayilar));

        int[][] triangleArray = {
                {1,2,3,4,5},
                {1,2,3,4},
                {1,2,3},
                {1,2},
                {1}
        };
        for (int i = 0; i < triangleArray.length; i++) {
            for (int j = 0; j < triangleArray[i].length; j++) {
                System.out.print(triangleArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
