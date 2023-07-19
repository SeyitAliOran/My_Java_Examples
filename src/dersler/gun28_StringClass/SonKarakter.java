package dersler.gun28_StringClass;

import java.util.Scanner;

public class SonKarakter {
    // Kullanicidan girilen kelimenin son harfini dinamik olarak bulan program....
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String str = sc.nextLine();

        System.out.println("Son Karakter= " + sonKarakter(str));
    }
    public static char sonKarakter(String s){
        return s.charAt(s.length()-1);
    }
}
