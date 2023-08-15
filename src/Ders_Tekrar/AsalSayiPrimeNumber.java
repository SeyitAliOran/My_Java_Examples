package Ders_Tekrar;

public class AsalSayiPrimeNumber {
    public static void main(String[] args) {
        int number = 1201;
        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println(number + " asal sayidir");
        }else {
            System.out.println(number + " asal sayi degildir");
        }
    }
}
