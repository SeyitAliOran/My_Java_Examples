package Alistirmalarim;

import java.util.Scanner;

public class DaireninAlaniVeCevresiniHesaplama {
    public static void main(String[] args) {
    int r;
    double alan,hacim,pi = 3.14;
    Scanner input = new Scanner(System.in);
        System.out.print("daire yari capini giriniz : ");
        r = input.nextInt();
        alan = 2* pi * r;
        hacim = pi * (r*r);
        System.out.println("dairenin alani : " + alan);
        System.out.println("dairenin hacmi : " +hacim);
    }
}
