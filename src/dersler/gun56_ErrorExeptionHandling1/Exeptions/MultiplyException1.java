package dersler.gun56_ErrorExeptionHandling1.Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplyException1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = 1, toplam = 0;

        while (true) {
            System.out.println("Programdan çıkış için 0 girin.");
            System.out.print("Klavyeden bir tam sayı giriniz : ");
            //Exception handling için monitor edeceğimiz kodları try{} bloğunun içerisine yazıyoruz.
            //Bir hatalı durum oluşması durumunda hatayı ilgili catch(){} bloğunda yakalıyoruz.
            try {
                sayi = Integer.parseInt(scanner.nextLine()); //int yerine başka tipte bir veri girersek NumberFormatException hatası oluşur.
                //sayi = scanner.nextInt(); //int yerine başka tipte bir veri girersek InputMismatchException hatası oluşur.
                if (sayi == 0) {
                    System.out.println("Programdan çıkılıyor...");
                    break;
                }
                System.out.println("Girilen sayı = " + sayi);
                toplam += sayi;
                System.out.println("toplam = " + toplam);
                System.out.println();
            } catch (InputMismatchException e) {
                //veritipinin max değerinden büyük bir değer girilfdiğinde
                //veritipinden farkli bir veritipi girildiğinde
                //scanner.nextInt() ile int yerine başka tipte bir veri girersek bu hata oluşur.
                System.out.println("Veritipi uyuşmazlığı hatası oluştu!!!");
                System.out.println("Exception class name : " + e.getClass().getSimpleName()); //Hata classı
                System.out.println("Exception Message    : " + e.getMessage()); //Orijinal hata mesajı
                System.out.println();
                 /*
                //Klavyeden enter a basıldığında girilen nextInt() tarafından integer ile alınır newline karakteri bufferda kalır.
                 O yüzden loop a girmemesi için nextLine ile buffer boşaltılması gerekir.
                 */
                scanner.nextLine(); //Klavye bufferdaki \n karakterini silmek için
            } catch (NumberFormatException e) {
                //veritipine uymayan bir tip dönüştürmesi yapılmaya çalışıldığında..>  int sayi = Integer.parseInt ("abc") ;
                System.out.println("Sayı format uyumsuzluğu!!!");
                System.out.println("Exception class name : " + e.getClass().getSimpleName()); //Hata classı
                System.out.println("Exception Message    : " + e.getMessage()); //Orijinal hata mesajı
                System.out.println();
            } catch (Exception e) {
                //Yukarıdaki exception larda yakalanamayan başka bir hata oluşursa burda yakalansın.
                e.printStackTrace(); //Hatanın bütün detaylarını konsola yazdır...
            }
        }
    }
}

