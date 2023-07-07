package dersler.gun26_Random_Math_Date_Classes;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class LocalTimeClass {
    public static void main(String[] args) {
        //Sadece saat bilgisini veren class
        LocalTime zaman = LocalTime.now(); //Bilgisayarın şuanki saat bilgisi.
        System.out.println("zaman = " + zaman);

        System.out.println("zaman.getHour() = " + zaman.getHour()); // Saat bilgisi "22" gibi
        System.out.println("zaman.getMinute() = " + zaman.getMinute()); // Dakika bilgisi "45" gibi
        System.out.println("zaman.getSecond() = " + zaman.getSecond()); // Saniye bilgisi "56" gibi
        System.out.println("zaman.getNano() = " + zaman.getNano()); // Nano saniye bilgisi "936163300" gibi

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss"); //Saat formatı--> saat:dakika:saniye
        System.out.println("dtf.format(zaman) = " + dtf.format(zaman)); // 10:51:15

        dtf = DateTimeFormatter.ofPattern("HH:mm:ss"); //24 saat dilimi
        System.out.println("dtf.format(zaman) = " + dtf.format(zaman)); // 22:51:15
    }
}
