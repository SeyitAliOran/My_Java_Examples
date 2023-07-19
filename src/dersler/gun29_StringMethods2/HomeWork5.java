package dersler.gun29_StringMethods2;

import java.util.Scanner;

public class HomeWork5 {
    //Write a program to count the number of occurrences for specific char
    //String word = “Abcdaorwakocoeeca”
    //Number of ‘a’ in this string is: 3
    public static void main(String[] args) {

        String word = "Ahmat";
        char karakter= 'a';
        System.out.println("Toplam "+ karakter + " sayisi= "+ count(word, karakter));
    }

    public static int count(String word, char ch) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
