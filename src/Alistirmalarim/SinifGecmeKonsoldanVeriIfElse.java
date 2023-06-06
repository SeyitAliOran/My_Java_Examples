package Alistirmalarim;
import java.util.Scanner;


public class SinifGecmeKonsoldanVeriIfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Kullanici tarafindan veri girilmesini saglar.
        int matematikvize1;
        int matematikvize2;
        int  matematikfinal;
        int almancavize1 = 0,almancavize2 = 0,almancafinal = 0;
        double almancaOrt,mathOrt;
        boolean almancaGectiMi = false;
        boolean matematikGectiMi = false;
        System.out.println("Puan Hesaplama Sistemi.");
        System.out.print("Matematik dersi 1. Vize notunu giriniz :");
        matematikvize1 = input.nextInt();
        System.out.print("Matematik dersi 2. Vize notunu giriniz :");
        matematikvize2 = input.nextInt();
        System.out.print("Matematik dersi Final notunu giriniz :");
        matematikfinal = input.nextInt();
        System.out.println();


        System.out.print("Almanca dersi 1. Vize notunu giriniz :");
        almancavize1 = input.nextInt();
        System.out.print("Almanca dersi 2. Vize notunu giriniz :");
        almancavize2 = input.nextInt();
        System.out.print("Almanca dersi Final notunu giriniz :");
        almancafinal = input.nextInt();
        System.out.println();

        System.out.println("Matematik dersi 1. Vize = " + matematikvize1);
        System.out.println("Matematik dersi 2. Vize = " + matematikvize2);
        System.out.println("Matematik final Notu = " + matematikfinal);
        System.out.println();

        System.out.println("Almanca dersi 1. Vize = " + almancavize1);
        System.out.println("Almanca dersi 2. Vize = " + almancavize2);
        System.out.println("Almanca final Notu = " + almancafinal);

        mathOrt = (matematikvize1*0.2)+(matematikvize2*0.2)+(matematikfinal*0.6);
       // matematikGectiMi = mathOrt >= 50 && mathOrt < 100;
        System.out.println();
        System.out.println("Matematik dersi yil sonu ortalamasi : " + mathOrt);
        if (mathOrt < 50){
            System.out.println("Matematik dersinden kaldiniz");
        }
        if ((mathOrt >= 80) && (mathOrt <= 100)){
            System.out.println("Matematik dersinden A ile gectiniz");
        }
        else if ((mathOrt >=60 ) && (mathOrt < 80)) {
            System.out.println("Matematik dersini B ile gectiniz.");
        }
        if((mathOrt >= 50) && (mathOrt < 60)){
            System.out.println(" Matematik dersini C ile gectiniz");
        }
        //System.out.println("Matematik dersini gecti mi = " + matematikGectiMi);
        System.out.println();
        almancaOrt = (almancavize1*0.2)+(almancavize2*0.2)+(almancafinal*0.6);
        //almancaGectiMi = almancaOrt >= 50 && almancaOrt <100;
        System.out.println("Almanca dersi yil sonu ortalamasi : " + almancaOrt );
        //System.out.println("Almanca dersini gecti mi = " + almancaGectiMi);
        if (almancaOrt < 50){
            System.out.println("Almanca dersinden kaldiniz");
        }
        if ((almancaOrt >= 80) && (almancaOrt <= 100)){
            System.out.println("Almanca dersinden A ile gectiniz");
        }
        else if ((almancaOrt >=60 ) && (almancaOrt < 80)) {
            System.out.println("Almanca dersini B ile gectiniz.");
        }
        if((almancaOrt >= 50) && (almancaOrt < 60)){
            System.out.println("Almanca dersini C ile gectiniz");
        }
        System.out.println();
        if ((mathOrt >= 50) && (almancaOrt >=50)) {
            System.out.println("Okulu gectiniz");
        }

    }
}
