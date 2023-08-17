package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    /*
    # Anagram
  * Write a return method that check if a string is build out of the same letters as another string.

 **Hint** Use scanner class to assign str1, str2 as same method parameter

   Example

1. display message : ``enter str1``

   input : `abc`

   display message : ``enter str2``

    input : `cab`

    output : `true`

3. display message : ``enter str1``

    input : `abc`

    display message : ``enter str2``

    input : `abb`

   output : `false`
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter str1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter str2: ");
        String str2 = scanner.nextLine();

        boolean result = areAnagrams(str1, str2);
        System.out.println("Output: " + result);


    }

    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
    }

