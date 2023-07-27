package CodingBath;

import java.util.Arrays;

public class ArrayReverse {
    /*
    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     */
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        int[] newNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i]= numbers[numbers.length-1-i];
        }

        System.out.println("Arrays.toString(newNumbers) = " + Arrays.toString(newNumbers));
    }
}
