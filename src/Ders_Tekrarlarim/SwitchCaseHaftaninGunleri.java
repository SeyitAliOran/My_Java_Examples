package Ders_Tekrarlarim;

import java.util.Scanner;

public class SwitchCaseHaftaninGunleri {
    public static void main(String[] args) {
        int day =0;
        String dayStr = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen 1-7 arasinda bir sayi giriniz... : ");
        day = scanner.nextInt();

        switch (day){
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
                System.out.println("Gecersiz bir sayi girdiniz");
        }
        if (dayStr !=""){
            System.out.println("Haftanin " + dayStr+ " günü");
        }
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
        }

    }
}
