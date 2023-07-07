package dersler.gun08_AssignmentRelationalLogical;

public class BasamaklaraAyirma {
    public static void main(String[] args) {

        // 4 basamakli sayiyi basamaklarin ayirma

        int sayi = 4567;
        int birler=0,onlar=0,yuzler=0,binler=0;

        System.out.println("Basamaklara ayirma... ");
        System.out.println("---------------------");

        System.out.println("Basamaklara ayrilan sayi = " + sayi);
        birler = sayi % 10;
        sayi /= 10; // bu islemden sonra mevcut 1234 teki 4 atiliyor.


        onlar = sayi % 10;
        sayi /= 10;

        yuzler = sayi % 10;
        sayi /= 10;

        binler = sayi % 10;
        sayi /= 10;

        System.out.println("Birler : " + birler);
        System.out.println("onlar  : " + onlar);
        System.out.println("yuzler : " + yuzler);
        System.out.println("binler : " + binler);
    }
}
