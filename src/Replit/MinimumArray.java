package Replit;

import java.sql.Array;

public class MinimumArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 70},
                {9, 10, 11, 23, 30, 50, 60}
        };

        int largestNumber = findLargestNumber(arr);
        System.out.println("The largest number is: " + largestNumber);
    }

    public static int findLargestNumber(int[][] arr) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > largest){
                    largest = arr[i][j];
                }
            }
        }

        return largest;
    }
}
