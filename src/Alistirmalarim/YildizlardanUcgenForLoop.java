package Alistirmalarim;

import java.util.Scanner;

public class YildizlardanUcgenForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) { //bu loop satirlari kontrol eder
            System.out.println();
            for (int j = 1; j <=i ; j++) { // bu loop sütunlari kontrol eder
                System.out.print("* ");
            }

        }
        System.out.println();
        for (int i = 5; i >0 ; i--) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");

            }
        }

        }
    }

