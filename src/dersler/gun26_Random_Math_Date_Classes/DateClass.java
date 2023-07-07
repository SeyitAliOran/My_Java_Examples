package dersler.gun26_Random_Math_Date_Classes;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date tarih = new Date();
        System.out.println("tarih = " + tarih); // bilgisayar da bulunan tarih ve saati yazar
        System.out.println("tarih.getDate() = " + tarih.getDate()); // Ayin kacinci gunu oldugunu gosterir
        System.out.println("tarih.getYear() = " + tarih.getYear());// Senenin kacinci gunu oldugunu gosterir
        System.out.println("tarih.getMonth() = " + tarih.getMonth()); //Senenin kacinci ayi oldugunu gosterir
        System.out.println("tarih.getDay() = " + tarih.getDay()); // haftanin kacinci ogunu oldugunu gösterir(0 -sunday)

        Date tarih1 = new Date(2023,5,25);
        System.out.println("tarih1.equals(tarih) = " + tarih1.equals(tarih)); // 2 tarihin birbirine esit olup olmadigini gosterir.
        System.out.println("tarih1.before(tarih) = " + tarih1.before(tarih)); // tarih  diger tarihten sonra mi
        System.out.println("tarih1.after(tarih) = " + tarih1.after(tarih)); // tarih  diger tarihten once mi
    }
}
