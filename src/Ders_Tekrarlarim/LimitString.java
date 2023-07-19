package Ders_Tekrarlarim;

import java.util.Scanner;

public class LimitString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string message and index number:");
        String input1 = scan.nextLine();
        int input2 = scan.nextInt();
       String limitStr =  getSubstringByIndex(input1, input2);
        System.out.println("limitStr = "+limitStr.trim());

    }

    public static String getSubstringByIndex(String message, int index) {
        if (index >= 0 && index < message.length()) {
            return message.substring(0, index+1);
        } else {
            return message;
        }

    }
}
