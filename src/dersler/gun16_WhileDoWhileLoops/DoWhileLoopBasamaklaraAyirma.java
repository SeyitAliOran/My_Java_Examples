package dersler.gun16_WhileDoWhileLoops;

import java.util.Scanner;

public class DoWhileLoopBasamaklaraAyirma {
    public static void main(String[] args) {
        //Klavyaden girilen bir tamsayinin basamaklarina toplamasi

        Scanner input = new Scanner(System.in);
        int sayi = 0;
        int rakam = 0;
        int basamak = 0;
        int toplam = 0;



        System.out.print("Klavyeden bir tam sayi giriniz : ");
        sayi = input.nextInt();
        do {
            basamak++;
            rakam = sayi %10;
            toplam += rakam;
            sayi = sayi/10;

           /* switch (basamak){
                case 1:
                    System.out.println("Birler basamagi = " + rakam);
                    break;
                case 2:
                    System.out.println("Onlar basamagi = " + rakam);
                    break;
                case 3:
                    System.out.println("Yuzler basamagi = " + rakam);
                    break;
                case 4:
                    System.out.println("Binler basamagi = " + rakam);
                    break;
                case 5:
                    System.out.println("Onbinler basamagi = " + rakam);
                    break;
                default:
                    System.out.println("Hatali basamak");
            }*/
        } while (sayi > 0);
        System.out.println("Basamaklarin toplami = " + toplam);
    }
}
