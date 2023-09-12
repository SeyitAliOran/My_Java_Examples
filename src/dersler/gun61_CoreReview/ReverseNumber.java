package dersler.gun61_CoreReview;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Kullanicidan cok basamakli bir sayi alarak
        // bu sayiyi ters ceviren bir method yaziniz
        // 7283455 --> 5543827
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println(reversedNumber);
    }
    public static int reverseNumber(int number){
        int reversed = 0;

        while (number != 0){
            int digit = number % 10;
            reversed = (reversed * 10) + digit;
            number /= 10;
        }

        return reversed;
    }
}
