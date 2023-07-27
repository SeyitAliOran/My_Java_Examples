package CodingBath;

import dersler.gun26_Random_Math_Date_Classes.MathRandom;

import java.util.Random;

public class RandomMathDateOrnek {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(); // Tüm tamsayı aralığında rastgele bir tamsayı
        System.out.println(randomInt);

        double randomDouble = random.nextDouble(); // 0.0 ile 1.0 arasında rastgele bir ondalık sayı
        System.out.println(randomDouble);

        boolean randomBoolean = random.nextBoolean(); // Rastgele true veya false
        System.out.println(randomBoolean);

        int randomInRange = random.nextInt(100); // 0 ile 99 arasında rastgele bir tamsayı
        System.out.println(randomInRange);

        int result1 = random.nextInt(1,10); // Bu sekilde 1 dahil 10 dahil degildir
        int result2 = random.nextInt(10,100+1); // Bu sekilde 10 ve 100 dahildir



        int sayi1 =12;
        int sayi2= 13;
        int max= Math.max(sayi1,sayi2);
        int min= Math.min(sayi1,sayi2);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // Math.random --> altSinir + (int) (Math.random() * ustSinir) --- altSinir - ustSinir arası tamsayı...ustSinir hariç
        int altSinir1 = 10;
        int ustSinir1 = 100;

        int rastgeleSayi1 = altSinir1 + (int) (Math.random() * (ustSinir1 - altSinir1)) ; // 10 - 100 arası tamsayı....100 dahil değil
        System.out.println("rastgeleSayi1 = " + rastgeleSayi1);


        int rastgeleSayi = (int) (Math.random()*10)+10;
        System.out.println("rastgeleSayi = " + rastgeleSayi);
    }
}
