package dersler.gun16_WhileDoWhileLoops;

import java.util.Scanner;

public class WhileLoopOgrenciNotlari {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int vize1 = 0;
        int vize2 = 0;
        int ortalama = 0;
        int counter = 0;
        int ogrNO = 0;

        String report = " Ögrencilerin vize notlari ve ders ortalamalari\n";

        while (true){

            System.out.print("Ögrencinin numarasini giriniz :");
            ogrNO = input.nextInt();
            if (ogrNO == 0){
                break;
            }
            System.out.print(ogrNO + " numarali ogrencinin 1. Vize notu : " );
            vize1 = input.nextInt();
            System.out.print(ogrNO + " numarali ogrencinin 2. Vize notu : " );
            vize2 = input.nextInt();

            ortalama = (vize1+vize2) /2;
            report += ogrNO +" numarali ögrencinin"+ "-"+"vize 1 = "+vize1 +"," + "vize2 ="+ vize2 +"  ögrencinin ortalama notu ="+ ortalama + "\n";
        }
        System.out.println();
        System.out.println(report);
    }
}
