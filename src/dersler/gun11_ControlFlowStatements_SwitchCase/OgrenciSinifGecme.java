package dersler.gun11_ControlFlowStatements_SwitchCase;

import java.util.Scanner;

public class OgrenciSinifGecme {
    public static void main(String[] args) {
        Scanner veriGIr = new Scanner(System.in);
        System.out.println("\nKlavyeden girilen ders notuna gore sinif gecme notunu ekrana yazdiran program.");
        System.out.println("------------------------------------------------------------------------------\n");

        int dersNotu = 0;
        char gecmeNotu = 'F';
        System.out.print("Ders notunuzu giriniz : ");
        dersNotu = veriGIr.nextInt();

        if (dersNotu >= 0  && dersNotu <= 100){
            if (dersNotu >= 90){
                gecmeNotu = 'A';
            }
            else if (dersNotu >= 80){
                gecmeNotu = 'B';
            }
            else if (dersNotu >= 70){
                gecmeNotu = 'C';
            }
            else if (dersNotu >= 60){
                gecmeNotu = 'D';
            }
            else if (dersNotu >= 50){
                gecmeNotu = 'E';
            }
            else {

                gecmeNotu = 'F';
            }
            if(gecmeNotu == 'F'){
                System.out.println("Ders gecme notunuz : " + gecmeNotu );
                System.out.println(dersNotu + " ile sinifta kaldiniz");
            }else {
                System.out.println("Ders gecme notunuz : " + gecmeNotu );
                System.out.println("Tebrikler " + dersNotu + " ile sinifi gectiniz");
            }

        }else System.out.println("Hatali bir ders notu girdiniz.");
    }
}
