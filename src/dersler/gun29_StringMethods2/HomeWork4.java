package dersler.gun29_StringMethods2;

import java.util.Scanner;

public class HomeWork4 {
    //Write a program that ask user to enter his/her firstname and lastname.
    // Display each character of full name in the console.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen adinizi giriniz: ");
        String name = sc.nextLine();
        System.out.print("Lutfen soyadinizi giriniz: ");
        String lastName = sc.nextLine();
        String full_Name = name.concat(" " + lastName);
        System.out.println("Full_Name = " + full_Name);
        System.out.println("full_Name.length() = " + full_Name.length());


    }
}
