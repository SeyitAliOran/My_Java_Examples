package Alistirmalarim;

import java.util.Scanner;

public class Ebob_EkokBulma {
    public static void main(String[] args) {
        int ebob = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz : ");
        int s1 = input.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        int s2 = input.nextInt();

        int min = (s1<s2) ? s1 : s2;
        for (int i = min; i >0; i--) {
            if ((s1 %i==0) && (s2 %i==0)){
                 ebob = i;
                break;
            }

        }

        int ekok = (s1*s2)/ ebob;
        System.out.println(s1 + " ve " + s2 + " Sayilarinin EBOB'U " + ebob);
        System.out.println(s1 + " ve " + s2 + " Sayilarinin EKOK'U " + ekok);
    }
}
