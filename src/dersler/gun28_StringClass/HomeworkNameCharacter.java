package dersler.gun28_StringClass;

import java.util.Scanner;

public class HomeworkNameCharacter {
    /*
    Write a program that ask user to enter his/her
    firstname and lastname. Display each character
    of full name in the console.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen isminizi ve soyisminizi giriniz: ");
        String nameLastName = sc.nextLine();
        for (int i = 0; i < nameLastName.length(); i++) {
            System.out.println("nameLastName.charAt(i) = " + nameLastName.charAt(i));
        }
    }
}
