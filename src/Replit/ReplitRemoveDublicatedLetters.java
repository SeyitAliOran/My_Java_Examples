package Replit;

import java.util.Scanner;

public class ReplitRemoveDublicatedLetters {
    /*
   Create a method that remove duplicates of each char of given String and display the result?
 **UniquChars**
# Example:
   1. input  :  "wooden-spoon"
      Output :  "woden-sp"
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String word = scan.nextLine();
        System.out.println(uniquChars(word));

    }
    public static String uniquChars(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char char1 = str.charAt(i);
            if (result.indexOf(char1) == -1) {
                result += char1;
            }
        }

        return result;
    }
}
