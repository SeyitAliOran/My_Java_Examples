package dersler.gun26_Random_Math_Date_Classes;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {

        System.out.println("Random Class -- generating random numbers. ");
        Random random = new Random(); // parantez icin seed ve herhangi bir sayi yazarsak degeri rastegeleligin tahmin edilmesini zorlastiriyor....

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);


        for (int i = 1; i <= 10; i++) {  //For loop dan dolayi 10 tane uretir.
            int randomIntLimited = random.nextInt(10); // 0-10 arasi ---- 10 üst limittir ve 10 uretilecek sayiya dahil degildir...
            System.out.println("randomLimited = " + randomIntLimited);
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            int randomInt2 = random.nextInt(5, 100);// 5-100 arasinda sayi uretir 5 dahildir 100 dahil degildir.
            System.out.println("randomInt2 = " + randomInt2);
        }
        System.out.println();


            double randomDouble1 = random.nextDouble(); // 0.0 ile 1.0 arasinda sayi uretir
            System.out.println("randomDouble = " + randomDouble1);
        System.out.println();

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);


        // Generating random numbers in given range. Only LOW side is inclusive.
        int low = 1;
        int high = 10;
        int result = random.nextInt(high-low)+low;

    }
}
