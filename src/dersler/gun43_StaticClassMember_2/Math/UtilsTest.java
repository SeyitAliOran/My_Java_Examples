package dersler.gun43_StaticClassMember_2.Math;

public class UtilsTest {
    public static void main(String[] args) {
        // calling static method factorial
        int num = 19;
        double celcius = 23.5;
        double fahrenheit = 70.3;
        int factorialResult = MathUtils.factorial(num);
        System.out.println("Factorial of "+num+" is = " + factorialResult);

        boolean isPrime = MathUtils.isPrime(num);
        System.out.println(num + " is " + (isPrime ? "" : "not ") + "a prime number");


        double celciusTemp = MathUtils.fahrenheitToCelcius(fahrenheit);
        System.out.println("celciusTemp = " + celciusTemp);

        double fahrenheitTemp = MathUtils.celciusToFahrenheit(celcius);
        System.out.println("fahrenheitTemp = " + fahrenheitTemp);

    }
}
