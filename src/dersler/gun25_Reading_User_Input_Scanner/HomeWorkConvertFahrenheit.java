package dersler.gun25_Reading_User_Input_Scanner;

import java.util.Scanner;
/*
       (Convert Celsius to Fahrenheit)
       Write a program that reads a Celsius degree in a double value from the console,
       then converts it to Fahrenheit and displays the result.
       The formula for the conversion is as follows:
       Fahrenheit = (9 / 5) * Celsius + 32

       Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
    */
public class HomeWorkConvertFahrenheit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Celcius degerini giriniz :");
        double celcius = scanner.nextDouble();
        double fahrenheit = (celcius*9/5)+32;
        System.out.println("Fahrenheit = " + fahrenheit);

    }
}
