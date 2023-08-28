package Replit;

public class Largest2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,70},
                {9,10,11,23,30,50,60}
        };
        int max = 0;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
