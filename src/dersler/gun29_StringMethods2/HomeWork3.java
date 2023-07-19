package dersler.gun29_StringMethods2;

import java.util.Scanner;

public class HomeWork3 {
    //Write a return method that can reverse a String
    //Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz: ");
        String word = sc.nextLine();
        System.out.println("reversed(word) = " + reversedWord(word));
    }
    public static String reversedWord(String word){
        String reserved = "";
        for (int i = word.length()-1; i >=0; i--) {
            reserved = reserved + word.charAt(i);
        }
        return reserved;
    }
}
