package Alistirmalarim;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir cumle girin : ");
        String cumle = scanner.nextLine().toLowerCase(); //toLowerCase girilen butun harfleri kucuk yapar

        // if else kullanmaliyiz, en kisitlayici olandan balayalim

        if(cumle.contains("ev") || cumle.contains("is")){ // contains icerisinde is geciyorsa sonucu yansitir
            System.out.println("Hem ev lazim hem is");

        }else if (cumle.contains("ev")){
            System.out.println("home sweet home");
        }else if (cumle.contains("is")){
            System.out.println("is lazim");
        }else System.out.println("cok calismam lazim");


    }
}
