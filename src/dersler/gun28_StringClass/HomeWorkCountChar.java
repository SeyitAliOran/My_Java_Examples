package dersler.gun28_StringClass;

import dersler.gun12_SwitchCaseStatements_SwitchCase.SwitchCase;

public class HomeWorkCountChar {
    /*
    Write a program to count the number of occurrences for specific char
    String word = “Abcdaorwakocoeeca”
    Number of ‘a’ in this string is: 3
     */
    public static void main(String[] args) {
        String word = "Abcdaorwakocoeeca";
        char karakter ='a';
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == karakter){
                count++;
            }
        }
        System.out.println(karakter+" sayiyi " + count);
    }
}
