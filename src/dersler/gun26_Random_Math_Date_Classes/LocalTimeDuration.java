package dersler.gun26_Random_Math_Date_Classes;
import java.time.Duration;
import java.time.LocalTime;
public class LocalTimeDuration {
    public static void main(String[] args) {
        //İki zaman arasındaki farkı veren class.
        LocalTime simdikiSaat = LocalTime.now();
        System.out.println("simdikiSaat = " + simdikiSaat);
        LocalTime tempSaat = LocalTime.of(10,35,50);

        Duration zamanFark = Duration.between(simdikiSaat, tempSaat);
        System.out.println("zamanFark = " + zamanFark); //PT-12H-26M-27.5228132S

        System.out.println("zamanFark.toHours() = " + zamanFark.toHours());//Saat cinsinden "-12" gibi
        System.out.println("zamanFark.toMinutes() = " + zamanFark.toMinutes() / 60); //Saat cinsinden "-12" gibi
        System.out.println("zamanFark.toMinutes() = " + zamanFark.toMinutes() % 60); //Dakika cinsinden "-26" gibi
        System.out.println("zamanFark.toSeconds() = " + zamanFark.toSeconds() % 60); //Saniye cinsinden "-26" gibi
    }
}
