package Ders_Tekrarlarim;

public class MethodsPrimeNumber {
    public static void main(String[] args) {
        isPrimeNumber(12);
    }
    public static int isPrimeNumber (int num) {

        for (int i = 2; i < num ; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number.");
                return num;
            }
        }
        System.out.println(num + " is a prime number.");
        return num;
    }
}
