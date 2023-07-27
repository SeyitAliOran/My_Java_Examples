package Replit;

import java.util.Scanner;

public class ReplitFrequencyOfChar {
    /*
    # Frequency Of Char


   * Write a return method that can find the frequency of
    characters

 * Example:

   input : ``AAABBCDD``

   Output : ``A3B2C1D2``
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String str = scan.nextLine();
        System.out.println(countletters(str));
    }

    public static String countletters(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++){
            char harf = str.charAt(i);
            int counter = 1;
            for (int j = i+1; j < str.length(); j++){
                if (harf == str.charAt(j)){
                    counter++;
                    i = j;
                }
            }

            result += harf + "" + counter;
        }
        return result;
    }

}
