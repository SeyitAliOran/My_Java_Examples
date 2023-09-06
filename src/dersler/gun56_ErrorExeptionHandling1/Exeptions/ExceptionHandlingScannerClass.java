package dersler.gun56_ErrorExeptionHandling1.Exeptions;

import java.util.Scanner;

public class ExceptionHandlingScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Test started");

        System.out.print("Klavyeden tam sayi giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Klavyeden bolen tam sayi giriniz: ");
        int bolen = scanner.nextInt();

        try{
            System.out.println(bolme(sayi1, bolen));
        }catch (ArithmeticException hata){
            System.out.println("Sifira bolunme hatasi olustu !!!"); // .err ile ekrana kirmizi sekilde yazar
            System.out.println("Hata = " + hata.getMessage());

            System.out.print("Klavyeden bolen tam sayi giriniz: ");
            bolen = scanner.nextInt();
        }

        System.out.println("Test ended");
    }
    public static int bolme(int sayiA, int bolen){
        int result = 0;
        try {
            result = sayiA/bolen;
        }catch (ArithmeticException hata){
            System.out.println("Sifira bolunme hatasi olustu !!!");
        }
        return result;
    }
}
