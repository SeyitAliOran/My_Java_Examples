package dersler.gun26_Random_Math_Date_Classes;

import java.util.Random;

public class RandomClassExercises {
    public static void main(String[] args) {

        int altSinir = 50;
        int ustSinir = 100;
        rastgeleTekSayiUret(50,99,10);
    }



    public static int rastgeleTekSayiUret(int low,int high){
        Random rastgele = new Random();
        int result = 0;

        if (low < high) {

            while (true) {
                result = rastgele.nextInt(high + 1 - low) + low; // +1 ekleyerek high da dahil olur....
                if (result % 2 != 0) { // Üretilen sayi tek sayi ise loop dan cikar degilse Loopa devam eder.
                    break;
                }
            }
        }
        return result;
    }


    public static void rastgeleTekSayiUret(int low,int high,int numbers){
        if (low < high) {
            for (int i = 1; i <= numbers; i++) {
                System.out.println(i + ".sayi :" + rastgeleTekSayiUret(low, high));
            }
        }else System.out.println("Baslangic degeri bitis degerinden büyük olamaz...");
    }
}
