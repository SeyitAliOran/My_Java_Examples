package dersler.gun26_Random_Math_Date_Classes;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class LocalDateYasHesaplama {
    public static void ageCalculate(int yil, int ay, int gun){
        LocalDate bugun = LocalDate.now();
        LocalDate dogumTarihi = LocalDate.of(yil, ay, gun); //Parametre olarak gelen bilgilerden bir tarih oluşturuyoruz.
        Period myAge = Period.between(dogumTarihi,bugun); // Kullanıcının girdiği tarih bilgisi ile bilgisayarın tarih bilgisi arasındaki farkı buluyoruz.

        //İki tarih arasındaki farkları yıl, ay, gün olarak yazdırıyoruz.
        System.out.println("Yaşınız : " + myAge.getYears() + " yıl,"
                + myAge.getMonths() + " ay,"
                + myAge.getDays() + " gün.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz      : "); // 1984
        int dogYil = sc.nextInt();

        System.out.print("Lütfen doğum ayınızı giriniz       : "); // 11
        int dogAy = sc.nextInt();

        System.out.print("Lütfen doğum gün bilgisini giriniz : "); // 25
        int dogGun = sc.nextInt();

        System.out.println();
        System.out.println("Hesaplama sonucunda....");
        ageCalculate(dogYil,dogAy,dogGun);
    }
}
