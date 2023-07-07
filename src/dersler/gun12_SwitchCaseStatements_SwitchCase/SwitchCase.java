package dersler.gun12_SwitchCaseStatements_SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Klavyeden girilen 1-7 araligindaki sayiya karsilik gelen haftanin gun bilgisini
        //switch cae yapisi kullanarak ekrana yazdiran bir program yaziniz...
        Scanner veriGir = new Scanner(System.in);

        System.out.println("Switch case in Java");
        System.out.println("Print day of week.");


        int day = 1;
        String dayStr = "";

        System.out.print("Klavyeden 1-7 araliginda bir gun degeri giriniz : ");
        day = veriGir.nextInt(); // Klavyeden bir tam sayi okur

        switch (day) {
            case 1:
                dayStr = "Pazartesi";
                break;
            case 2:
                dayStr = "Sali";
                break;
            case 3:
                dayStr = "Carsamba";
                break;
            case 4:
                dayStr = "Persembe";
                break;
            case 5:
                dayStr = "Cuma";
                break;
            case 6:
                dayStr = "Cumartesi";
                break;
            case 7:
                dayStr = "Pazar";
                break;
            default:
                System.out.println("Girilen gun degeri hatali !!!");
                System.out.println("1-7 araliginda bir deger giriniz...");
        }
        if(dayStr != ""){
            System.out.println("Haftanin "+ dayStr +" gunu.");

        }

        //Klavyeden girilen gun bilgisinin hafta ici veya hafta sonumu oldugunu soylesin

        switch (day){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta Sonu");
            default:
                System.out.println("Girilen gun degeri hatali !!!");
                System.out.println("1-7 araliginda bir deger giriniz...");
        }
    }
}
