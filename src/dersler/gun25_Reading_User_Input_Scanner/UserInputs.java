package dersler.gun25_Reading_User_Input_Scanner;

import dersler.gun20_Methods2.KDVHesapla;

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        System.out.println("Reading user inputs with Scanner Class");
        Scanner sc = new Scanner(System.in);

        System.out.print("Klavyeden BYTE türünde bir veri giriniz. : ");
        byte byte1 = sc.nextByte();
        System.out.println("Girilen BYTE deger : " + byte1);

        System.out.println();
        System.out.print("Klavyeden INT türünde bir veri giriniz. : ");
        int int1 = sc.nextInt();
        System.out.println("Girilen INT deger : " + int1);

        System.out.println();
        System.out.print("Klavyeden SHORT türünde bir veri giriniz. : ");
        short short1 = sc.nextShort();
        System.out.println("Girilen SHORT deger : " + short1);

        System.out.println();
        System.out.print("Klavyeden FLOAT türünde bir veri giriniz. : ");
        float float1 = sc.nextFloat();
        System.out.println("Girilen FLOAT deger : " + float1);

        System.out.println();
        System.out.print("Klavyeden DOUBLE türünde bir veri giriniz. : ");
        double double1 = sc.nextDouble();
        System.out.println("Girilen DOUBLE deger : " + double1);

        System.out.println();
        System.out.print("Klavyeden BOOLEAN türünde bir veri giriniz. : ");
        boolean boolean1  = sc.nextBoolean();
        System.out.println("Girilen BOOLEAN deger : " + boolean1);

        System.out.println();
        System.out.println("Klavyeden STRING türünde bir veri giriniz. : ");
        String string1 = sc.next();
        System.out.println("Girilen STRING deger : " + string1);

        sc.nextLine();// bos bir nextLIine kendinden once hafizada kalanlari siler
        System.out.println(); //String nextLine klavyeden veri girisi en uste yapilmali yoksa eksik oluyor
        System.out.println("Klavyeden STRING türünde bir veri giriniz. : ");
        String string2 = sc.nextLine();
        System.out.println("Girilen STRING deger : " + string2);


        // uygun bir veri tipi ile giris yapildiginda InoutMisMatch hatasi verir.
        sc.close(); // CLass ile isimiz bittiginde bu sekilde close etmemiz gerekiyor.
    }
}