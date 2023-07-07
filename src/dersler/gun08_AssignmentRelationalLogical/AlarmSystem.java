package dersler.gun08_AssignmentRelationalLogical;

public class AlarmSystem {
    public static void main(String[] args) {
        System.out.println("Alarm system with Logical operators.");
        // Sensors hirsizliga karsi kurulan bir alarm sistemi.
        // || baglacinda herhangi bir deger eger TRUE ise sonuc TRUE olur.
        boolean anaKapi  = false;
        boolean pencere1 = false;
        boolean pencere2 = false;
        boolean pencere3 = false;
        boolean balkonKapisi = false;
        boolean alarmTetiklendiMi = false;

        System.out.println("ALarm sistemi durumu....");
        System.out.println("------------------------");
        System.out.println("Anaakapi Sensoru = " + anaKapi);
        System.out.println("Pencere-1 Sensoru = " + pencere1);
        System.out.println("Pencere-2 Sensoru = " + pencere2);
        System.out.println("Pencere-3 Sensoru = " + pencere3);
        System.out.println("Balkon kapisi Sensoru = " + balkonKapisi );
        alarmTetiklendiMi = (anaKapi || pencere1 || pencere2 || pencere3 || balkonKapisi);
        System.out.println("Alarm status = " + alarmTetiklendiMi + "\n");

        pencere1 = false;
        System.out.println("ALarm sistemi durumu....");
        System.out.println("------------------------");
        System.out.println("Anaakapi Sensoru = " + anaKapi);
        System.out.println("Pencere-1 Sensoru = " + pencere1);
        System.out.println("Pencere-2 Sensoru = " + pencere2);
        System.out.println("Pencere-3 Sensoru = " + pencere3);
        System.out.println("Balkon kapisi Sensoru = " + balkonKapisi + "\n");
        alarmTetiklendiMi = (anaKapi || pencere1 || pencere2 || pencere3 || balkonKapisi);
        System.out.println("Alarm status = " + alarmTetiklendiMi + "\n");

        balkonKapisi = true;
        pencere3 = true;
        // BAlkon kapisi ve pencere3 un ikisininde TRUE olmasi durumunda alarm aktif olur.
        //Pencere 3 True ise balkonkapisinida kontrol eder. eger pencere3 false ise balkon kapisini kontrol etmez.Sonuc false olur.
        alarmTetiklendiMi = (anaKapi || pencere1 || pencere2 || (pencere3 && balkonKapisi));
        System.out.println("ALarm sistemi durumu....");
        System.out.println("------------------------");
        System.out.println("Anaakapi Sensoru = " + anaKapi);
        System.out.println("Pencere-1 Sensoru = " + pencere1);
        System.out.println("Pencere-2 Sensoru = " + pencere2);
        System.out.println("Pencere-3 Sensoru = " + pencere3);
        System.out.println("Balkon kapisi Sensoru = " + balkonKapisi + "\n");
        System.out.println("Alarm status = " + alarmTetiklendiMi + "\n");



    }
}
