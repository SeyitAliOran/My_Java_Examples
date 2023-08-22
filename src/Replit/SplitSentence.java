package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence {
    /*
    * Write a function that converts a sentence to an Array.
  * Use the Scanner class.

    Input :

   ``Hello, I am learning java``

   Output :

   ``Enter a sentence :``

   ``[Hello,, I, am, learning, java]``
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = convertToWordArray(input);

        System.out.print("[");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            if (i < words.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

    public static String[] convertToWordArray(String sentence) {
        return sentence.split(" ");
    }
}
