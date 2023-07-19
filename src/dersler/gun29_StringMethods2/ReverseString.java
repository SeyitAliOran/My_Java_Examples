package dersler.gun29_StringMethods2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        // Kullanicidan gelen string i ters ceviren bir program yaziniz

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String original = sc.nextLine();
        String reversed = "";

        for(int i = original.length()-1; i >=0; i--){
            reversed = reversed + original.charAt(i);
        }

        System.out.println("reversed = " + reversed);
    }
}

