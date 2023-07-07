package dersler.gun25_Reading_User_Input_Scanner;

import java.util.Scanner;

public class ScannerCalculateCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yari capini giriniz : ");
        int radius = input.nextInt();
        System.out.println("Yaricapi "+radius+" ve PI sayisi "+ PI_SAYISI +" olan Dairenin alani = " + area(radius));
        System.out.println("Yaricapi "+radius+" ve PI sayisi "+ PI_SAYISI +" olan Cemberin cevresi = " + perimetr(radius));
    }
    public static double area(int radius){
        return radius*radius*PI_SAYISI;

    }
    public static double perimetr(int radius){
        return 2 * radius*PI_SAYISI;
    }
     final static double PI_SAYISI = 3.14;
}
