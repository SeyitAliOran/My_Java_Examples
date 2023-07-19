package dersler.gun28_StringClass;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        // Kullanicidan 2 farkli String alip bu Stringleri ayri ayri method ile uzunluklarini karsilastirarak
        // Sonucu gosteren bir program yaziniz...
        // "CAN" - "CAN" --> true
        // "CAN" - "CEM" --> true
        // "CAN" - "CAND" --> false
        Scanner sc = new Scanner(System.in);

        System.out.print("Lutfen bir kelime giriniz...: ");
        String str1 = sc.nextLine();

        System.out.print("Lutfen bir kelime giriniz...: ");
        String str2 = sc.nextLine();

        System.out.println("Stringlerin uzunluklari esit mi?: " + compareStrings(str1, str2));
    }
    public static boolean compareStrings(String s1, String s2){
        System.out.println("s1.length() = " + s1.length());
        System.out.println("s2.length() = " + s2.length());
        return (s1.length()==s2.length());
    }





}
