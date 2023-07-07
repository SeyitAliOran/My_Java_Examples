package dersler.gun04_Variables_1;

import java.security.spec.RSAOtherPrimeInfo;

public class Variables { //Class isimlendirmelerinin ilk harfini buyuk yaziyoruz.
    /*
   Data Type   Size            Range
   byte        1 byte          Integers in the range of −128 to +127
   short       2 bytes         Integers in the range of −32,768 to +32,767
   int         4 bytes         Integers in the range of −2,147,483,648 to +2,147,483,647
   long        8 bytes         Integers in the range of −9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
   float       4 bytes         Floating-point numbers in the range of ±3.4 × 10^−38 to ±3.4 × 10^38,with 7 digits of accuracy
   double      8 bytes         Floating-point numbers in the range of ±1.7 × 10^−308 to ±1.7 × 10^308,with 15 digits of accuracy
   boolean     1 bit           true or false
    */

    public static void main(String[] args) {
    boolean evliMi; //True or False
    boolean gectiMi; //True or False
    byte siraNumarasi;
    short urunKategoriNo;
    int salary;
    long bankaMusterilerBakiyesi;
    float kdvOrani;
    double buyukOndalikliBirSayi;

    evliMi = true;
    gectiMi = false;
        System.out.println("Evli mi? :" + evliMi);
        System.out.println("Sinifi gecti mi? :" + gectiMi);
    //byte -128 ile +127 araliginda ki degerler
        siraNumarasi = 125;
        System.out.println("Sira numarasi :" + siraNumarasi);
        // short veri tipi -32768 to + 32767
        urunKategoriNo = 32000;
        System.out.println("Urun KategoriNo = " + urunKategoriNo);
        //int - Integers in the range of −2,147,483,648 to +2,147,483,647
        salary = 2_000_000_000; //Buyuk sayilari okunakli yapmak icin _ kullanilir
        System.out.println("Salary = " + salary);
        //  long Integers in the range of −9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
        bankaMusterilerBakiyesi = 1_234_567_895_678_432_231L; // integer ile karistirmamak icin sonuna buyuk L ekle
        System.out.println("Banka Musteriler Bakiyesi :" + bankaMusterilerBakiyesi);
        // Floating-point numbers in the range of ±3.4 × 10^−38 to ±3.4 × 10^38,with 7 digits of accuracy
        kdvOrani = 0.18F; // float olarak tanilamalarda sonuna buyuk F veya kucuk f koy
        System.out.println("Kdv Orani :" + kdvOrani);
        kdvOrani = 3.123456788911F;
        System.out.println("Kdv Orani :" + kdvOrani);
        //Double-point numbers in the range of ±1.7 × 10^−308 to ±1.7 × 10^308,with 15 digits of accuracy
        buyukOndalikliBirSayi = 2376.5757864758586D; // Double olarak tanilamalarda sonuna buyuk D veya kucuk d koy
        System.out.println("Buyuk Ondalikli Bir Sayi :" + buyukOndalikliBirSayi);
    }
}
