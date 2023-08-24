package Replit;

import java.sql.Array;

public class MinimumArray {
    public static void main(String[] args) {
        int[] array = {4,3,2};
        int min = minArray(array);
        System.out.println("min = " + min);


    }
    public static int minArray(int[] array){
        int minimum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }

        return minimum;
    }
}
