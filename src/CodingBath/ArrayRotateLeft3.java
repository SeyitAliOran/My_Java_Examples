package CodingBath;

import dersler.gun30_Array.Array;
import dersler.gun35_ArrayList.Araba;

import java.util.Arrays;

public class ArrayRotateLeft3 {
    /*

Given an array of ints length 3, return an array with the elements
"rotated left" so {1, 2, 3} yields {2, 3, 1}.
     */
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
       rotateLeft3(numbers);
    }
    public static void rotateLeft3(int[] nums) {
        int[] rotatedNumbers= new int[3];
        for (int i = 1; i < nums.length; i++) {
            rotatedNumbers[i-1] = nums[i];
        }
        rotatedNumbers[rotatedNumbers.length-1] = nums[0];
        System.out.println("Arrays.toString(rotatedNumbers) = " + Arrays.toString(rotatedNumbers));
    }


}
