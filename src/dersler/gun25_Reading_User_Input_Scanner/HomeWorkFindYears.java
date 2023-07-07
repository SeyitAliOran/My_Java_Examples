package dersler.gun25_Reading_User_Input_Scanner;

import java.util.Scanner;

/*
       (Find the number of years)
        Write a program that prompts the user to enter the minutes (e.g., 1 billion),
        and displays the number of years and days for the minutes.
        For simplicity, assume a year has 365 days.


    */
public class HomeWorkFindYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        int day = 0;

        System.out.print("Dakika girin: ");
        int minut = sc.nextInt();

        year = minut / (60 * 24 * 365); // Dakikanin yil cinsinden degeri
        day = minut % (60 * 24 * 365) / (60 * 24); //Dakika mod yil yaptigimizda kalan dakikadir onu da 60 ve 24 e bölerek günü buluruz.

        System.out.println(minut + " dakika " + year + " yil ve " + day + " gün eder.");


    }
}
