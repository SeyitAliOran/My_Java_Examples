package dersler.gun56_ErrorExeptionHandling1.Exeptions;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        //Handling with try{} catch{} block syntax
        try {
            //test the codes which are monitored.
            //if something wrong throws exception
        }catch (Exception e){
            //Exception catch block
            //Handling the exception if necessary
        }
        ///////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);
        int sayi1 = 156;
        int bolen = 0;


        System.out.println("Test started...");
        System.out.print("Klavyeden birinci tamsayı giriniz : ");
        sayi1 = scanner.nextInt();
        System.out.print("Klavyeden bölen tamsayı giriniz : ");
        bolen = scanner.nextInt();

        try {
            //   System.out.println("Sonuç = " + (sayi1 / bolen));
            System.out.println("Sonuç : "+ bolme(sayi1, bolen));
        }catch (ArithmeticException hata){
            System.out.println("Sıfıra bölünme hatası oluştu!!!.");
            System.out.println("istisna : " + hata.getMessage());

            System.out.print("Klavyeden bölen tamsayı giriniz : ");
            bolen = scanner.nextInt();
            System.out.println("Sonuç = " + (sayi1 / bolen));
            // hata.printStackTrace();
        }
        catch (Exception hata){
            System.out.println(hata.getMessage());
            hata.printStackTrace();
        }
        System.out.println("Test ended.");
    }

    public static int bolme(int sayiA, int bolen){
        int result = 0;

        result = sayiA / bolen;

        /*try {
            result = sayiA / bolen;
        }catch (ArithmeticException hata){
            System.out.println("Sıfıra bölünme hatası oluştu!!!.");
        }catch (Exception hata){
            hata.printStackTrace();
        }*/
        return result;
    }
}
