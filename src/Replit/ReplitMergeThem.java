package Replit;

import java.util.Scanner;

public class ReplitMergeThem {
    /*
    # Merge Them
* Create a method which we can pass 2 String as arguments and merge them into a new String.
* You have to merge them one by one for each character of Strings, and have to add the chars of longer String to the end as seen in below.

  # Example:

 1. mergeString("``12345``", "``abcdefghijk``")

 output:

 ``1a2b3c4d5efghijk``

 2. coverString("``Hello``", "``Java``")

 output:

 ``HJealvlao``

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Iki kelime giriniz: ");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        System.out.println(mergeString(str1, str2));

    }
    public static String mergeString(String str1, String str2){
        String result = "";
        int maxLength = Math.max(str1.length(),str2.length());
        for (int i = 0; i< maxLength; i++){
            if (i < str1.length()){
                result += str1.charAt(i);
            }
            if (i < str2.length()){
                result += str2.charAt(i);
            }
        }

        return result;
    }
}
