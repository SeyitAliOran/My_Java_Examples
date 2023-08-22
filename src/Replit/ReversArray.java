package Replit;

public class ReversArray {
    /*
    # Reverse Array
  *  Write a function that can reverse an array
Input:
   ``int [] arr = {4,7,8,9}``
  Output:
  ``int [] arr = {9,8,7,4}``
     */
    public static void main(String[] args) {
        int[] arr={4,7,8,9};

            for (int i = arr.length-1; i>=0 ; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }

