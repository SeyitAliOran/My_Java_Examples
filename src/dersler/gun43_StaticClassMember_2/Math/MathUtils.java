package dersler.gun43_StaticClassMember_2.Math;

public class MathUtils {
    // This is a util class, so no to instantiate an object due to all methods being static
    private MathUtils(){ } // private olduhundan bu sekilde ana classs da sadece methodlar kullanilir object olusturulamaz


    // Static method to calculate factorial of a number
    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    // Static method to check a number is prime
    public static boolean isPrime(int n){
        if (n <=1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n %i == 0){
                return false;
            }
        }
        return true;
    }
    // Calling method  celcius to fahrenheit
    public static double celciusToFahrenheit(double celcius){
        return (celcius * 9/5)+32;
    }
    // Calling method fahreneit to celcius
    public static double fahrenheitToCelcius(double fahrenheit){
        return (fahrenheit -32) * 5 / 9;
    }
}
