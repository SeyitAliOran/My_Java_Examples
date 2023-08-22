package dersler.gun46_Review.Static;

import java.time.LocalDate;
import java.time.Period;

public class StaticCalculator {
    private StaticCalculator(){
    }
    public static int topla(int sayiA,int sayiB){
        return sayiA + sayiB;
    }
    public static int topla(int...sayilar){ // bu sekilde sonsuz sayiyi toplayabiliriz. Sistem bunu array olarak kaydeder.
       int result = 0;
        for (int sayi:sayilar) {
            result += sayi;
        }
        return result;
    }
    public static int calculateAge(LocalDate birthDate){
        LocalDate bugun = LocalDate.now();
        Period period = Period.between(birthDate,bugun);
        return period.getYears();
    }
    //bu sekilde de yas hesaplayabiliriz...
    public static int calculateAge(int year, int month,int day){
        LocalDate birthDate = LocalDate.of(year,month,day);
        LocalDate bugun = LocalDate.now();
        Period period = Period.between(birthDate,bugun);
        return period.getYears();
    }


}
