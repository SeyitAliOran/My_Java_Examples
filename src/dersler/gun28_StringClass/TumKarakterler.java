package dersler.gun28_StringClass;

import java.util.Scanner;

public class TumKarakterler {
    // Kullanicidan aldigimiz bir stringin tum karakterlerini yazdiran bir method yazdirin
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz: ");
        String str = sc.next();
        tumKarakter(str);
    }
    public static void tumKarakter(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
