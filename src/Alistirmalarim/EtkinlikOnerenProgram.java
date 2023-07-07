package Alistirmalarim;

import java.util.Scanner;

public class EtkinlikOnerenProgram {
    public static void main(String[] args) {
        //Hava sicakligini al
        // Scaklik 30 veya daha yuksekse yozme etkinligi oner
        // 5 ve 30 arasinda ise sinema oner
        // 4 ve ya daha az ise kayak yapmayi oner
        Scanner scan = new Scanner(System.in);
        int sicaklik;
        System.out.print("Hava sicakligini giriniz : ");
        sicaklik = scan.nextInt();
        if(sicaklik > 30){
            System.out.println("Bu havada yuzmeye gidilir...");
        }else if (sicaklik < 30 && sicaklik >= 5){
            System.out.println("Bu havada en iyi sinemaya gidilir...");
        }else {
            System.out.println("Bu havada en iyi kayak yapmaya gidilir...");
        }
    }

}
