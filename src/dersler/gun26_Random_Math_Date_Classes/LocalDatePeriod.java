package dersler.gun26_Random_Math_Date_Classes;

import java.time.LocalDate;
import java.time.Period;

public class LocalDatePeriod {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate tempDate = LocalDate.of(2020,3,25);

        System.out.println("localDate = " + localDate);
        System.out.println("tempDate = " + tempDate);

        //Parametre olarak verilen iki tarih arasındaki farkı verir.
        Period tarihAraligi = Period.between(tempDate,localDate);

        System.out.println("tarihAraligi = " + tarihAraligi); //P3Y3M11D --> P-period  Y-year M-month D-day
        System.out.println("tarihAraligi.getYears() = " + tarihAraligi.getYears());//İki tarih arasındaki fark yıl cinsinden "3" gibi
        System.out.println("tarihAraligi.getMonths() = " + tarihAraligi.getMonths());//İki tarih arasındaki fark Ay cinsinden "3" gibi
        System.out.println("tarihAraligi.getDays() = " + tarihAraligi.getDays()); //İki tarih arasındaki fark Gün cinsinden "11" gibi
    }
}
