package dersler.gun26_Random_Math_Date_Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateClass {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();

        System.out.println("tarih = " + tarih);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy"); //Tarih bilgisini belirlediğimiz formatta göstermek için DateTimeFormatter kullanıyoruz
        System.out.println("dtf.format(tarih) = " + dtf.format(tarih)); //yyyy formatında sadece yıl bilgisini yazdırır.

        dtf = DateTimeFormatter.ofPattern("MMMM");
        System.out.println("dtf.format(tarih) = " + dtf.format(tarih)); //Ay bilgisini metinsel olarak yazdırı "Temmuz" gibi

        dtf = DateTimeFormatter.ofPattern("dd");
        System.out.println("dtf.format(tarih) = " + dtf.format(tarih)); // Gün nbilgisini iki haneli olarak yazdırı "06" gibi

        dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println("dtf.format(tarih) = " + dtf.format(tarih)); //06-Temmuz-2023 gibi

        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue()); // Ay bilgisini yazdırır
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek()); //Haftanın gününü yazdırı "THURSDAY"
        System.out.println("tarih.getEra() = " + tarih.getEra()); // Yüzyıl bilgisi "CE" gibi
        System.out.println("tarih.lengthOfMonth() = " + tarih.lengthOfMonth()); // Ayın gün sayısını yazdırır "31" gibi
    }
}
