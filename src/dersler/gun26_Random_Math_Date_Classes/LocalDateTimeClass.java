package dersler.gun26_Random_Math_Date_Classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeClass {
    public static void main(String[] args) {
        //Tarih ve saat bilgisini birlikte veren bir class
        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("tarihSaat = " + tarihSaat); //2023-07-06T22:47:13.999152400

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy - HH:mm:ss");
        System.out.println("dtf.format(tarihSaat) = " + dtf.format(tarihSaat)); //06-Temmuz-2023 - 22:47:13

        dtf = DateTimeFormatter.ofPattern("HH:mm:ss - dd-MMMM-yyyy");
        System.out.println("dtf.format(tarihSaat) = " + dtf.format(tarihSaat)); //22:47:13 - 06-Temmuz-2023

        dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println("dtf.format(tarihSaat) = " + dtf.format(tarihSaat)); // 06-Temmuz-2023

        System.out.println("tarihSaat.getHour() = " + tarihSaat.getHour()); // saat bilgisi "22" gibi
        System.out.println("tarihSaat.getMinute() = " + tarihSaat.getMinute()); // dakika bilgisi "47" gibi.
        System.out.println("tarihSaat.getSecond() = " + tarihSaat.getSecond()); // saniye bilgisi "59" gibi.

        dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("dtf.format(tarihSaat) = " + dtf.format(tarihSaat)); // 22:47:13
    }
}
