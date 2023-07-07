package dersler.gun25_Reading_User_Input_Scanner;

import java.util.Scanner;

public class GirilenSayininBasamaklarinToplami {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Klavyeden (0-1000) bir tamsayı giriniz : ");
        int sayi = sc.nextInt();
        int basamakSayi = 0;
        int basamakToplam = 0;
        int basamakCounter = 0;

        if(sayi > 0 && sayi <= 1000){
            //Basmakları bulma
            while (sayi != 0){
                basamakCounter++;
                basamakSayi = sayi %10;
                //
                System.out.println(basamakSayi + "-" + basamakYazdir(basamakCounter));
                basamakToplam += basamakSayi;
                sayi /= 10;
            }
        }else {
            System.out.println("Girdiğiniz sayı belirlenen aralıkta değil!!!");
            return;
        }
        System.out.println("Sayının basamaklarının toplamı = " + basamakToplam);
    }

    public static String basamakYazdir(int basamak){
        String result = "";
        /*switch (basamak){
            case 1:
                result = "Birler basamağı";
                break;
            case 2:
                result = "Onlar basamağı";
                break;
            case 3:
                result = "Yüzler basamağı";
                break;
            case 4:
                result = "Binler basamağı";
                break;
            default:
                result= "Hatalı basamak!!!";
        }*/

        //Advanced swicth case
        switch (basamak){
            case 1 -> result = "Birler basamağı";
            case 2 -> result = "Onlar basamağı";
            case 3 -> result = "Yüzler basamağı";
            case 4 -> result = "Binler basamağı";
            default -> result= "Hatalı basamak!!!";
        }
        return result;
    }
}
