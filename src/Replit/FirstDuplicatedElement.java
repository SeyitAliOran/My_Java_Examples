package Replit;

public class FirstDuplicatedElement {
    /*
    # First Duplicated Element

* Write a program that can find the first duplicated element from the array

  Input:

    ``int [] arr = {10, 5, 3, 4, 3, 5, 6}``

  Output:

  ``5``

  Explanation:

   5 is the first element that repeats

  Input:

   ``int [] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10}``

  Output:

   ``6``

  Explanation: 6 is the first element that repeats

     */
    public static void main(String[] args) {
        int [] arr = {10, 5, 3, 4, 3, 5, 6};
        int [] arr1 = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int newElement = 0;


        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr1.length-1; j++) {
                if (arr[i] == arr1[j]) {
                   newElement = arr[j];
                }
            }
        }
        System.out.println(newElement);
        }
    }

