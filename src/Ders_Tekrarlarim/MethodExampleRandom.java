package Ders_Tekrarlarim;

import java.util.Scanner;

public class MethodExampleRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Baslangic sayisini giriniz = ");
        int start = scanner.nextInt();

        System.out.print("Bitis sayisini giriniz = ");
        int end = scanner.nextInt();

        System.out.print("Kac adet sayi uretmek istersiniz = ");
        int counter = scanner.nextInt();

        System.out.print("Uretmek istediginiz sayinin son rakamini giriniz = ");
        int lastDigit = scanner.nextInt();

        rastgeleSayiUret(start,end,counter,lastDigit);


    }

    public static void rastgeleSayiUret (int start, int end, int counter, int lastDigit){
        int mod = 2;
        if (lastDigit %2 == 0){
            mod = 3;
        }
        for (int i = 1; i <= counter ;) {
            int sayi = (int) (Math.random()*end+start);

            if (sayi %mod !=0){
                if (sayi %10 != lastDigit)  {
                    continue;
                }
                System.out.println(i + ".sayi" + sayi);
                i++;
            }
        }
    }


}
