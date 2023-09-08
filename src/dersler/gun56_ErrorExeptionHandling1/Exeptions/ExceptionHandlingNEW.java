package dersler.gun56_ErrorExeptionHandling1.Exeptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingNEW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int bolen = 0;
        int sonuc = 0;

        System.out.print("Klavyeden bir tamsayı giriniz : ");
        sayi = scanner.nextInt();

        System.out.print("Klavyeden bir bölen tam sayı giriniz : ");
        bolen = scanner.nextInt();
        while (true){
            //Exception handling için monitor edeceğimiz kodları try{} bloğunun içerisine yazıyoruz.
            //Bir hatalı durum oluşması durumunda hatayı ilgili catch(){} bloğunda yakalıyoruz.
            try {
                System.out.println("Sonuç = " + bolme(sayi,bolen));
                break;
            }catch (ArithmeticException e){
                System.out.println("Sıfıra bölme hatası oluştu !!!");
                System.out.println("Hata : " + e.getMessage());

                System.out.print("Klavyeden bir bölen tam sayı giriniz : ");
                bolen = scanner.nextInt();
            }
        }
    }
    public static int bolme(int sayiA, int bolen){
        int result = 0;
        result = sayiA / bolen;
        return result;
    }
}