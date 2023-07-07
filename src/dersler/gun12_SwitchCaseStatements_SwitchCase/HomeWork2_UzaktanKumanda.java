package dersler.gun12_SwitchCaseStatements_SwitchCase;

import java.util.Scanner;

public class HomeWork2_UzaktanKumanda {
    public static void main(String[] args) {
        Scanner kanallar = new Scanner(System.in);
        int tus;

        System.out.print("Kumandadan 1-10 arasi bir tusa basin : ");
        tus = kanallar.nextInt();
        switch (tus){
            case 1:
                System.out.println("Kanal TRT");
                break;
            case 2:
                System.out.println("Kanal Fox");
                break;
            case 3:
                System.out.println("Kanal Atv");
                break;
            case 4:
                System.out.println("Kanal Trt");
                break;
            case 5:
                System.out.println("Kanal Turk");
                break;
            case 6:
                System.out.println("Kanal ShowTv");
                break;
            case 7:
                System.out.println("Kanal Star");
                break;
            case 8:
                System.out.println("Kanal D");
                break;
            case 9:
                System.out.println("Kanal Trt Turk");
                break;
            case 10:
                System.out.println("Kanal Tv8");
                break;
            default:
                System.out.println("Lutfen 1-10 arasi kanal giriniz...");
        }


    }
}
