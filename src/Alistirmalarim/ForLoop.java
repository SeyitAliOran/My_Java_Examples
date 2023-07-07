package Alistirmalarim;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // 1 den 100 kadar (100) dahil olan tam sayilari toplayin
       /* int toplam = 0;
        for ( int i = 1 ; i <= 100 ; i++ ){
            toplam +=i;
        }
        System.out.println(toplam);
        System.out.println();

        // verilen iki sayinin ilkinden baslayip ikinciye kadar
        // 3 er 3 er yazdirin (ikinci sayi sartlari saglamiyorsa yazdirilmayabilir.
        int bas = 20;
        int bitis = 29;
        for (int i = bas; i <=bitis ; i+=3){
            System.out.print(i + " ");

            System.out.println();*/

            // verilen sayidan baslayarak 1 e dogru
            // 3 ile bolunebilen sayilari yazdirin

            Scanner deger = new Scanner(System.in);
            int input;
            System.out.print("bir sayi giriniz : ");
            input = deger.nextInt();;
            for (int k = input; k >=1 ; k--){
                if(k %3==0){
                    System.out.print(+k + " ");
                }
            }
        }
    }

