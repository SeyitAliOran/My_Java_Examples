package dersler.gun28_StringClass;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HomeworkEnterName {
    /*
    Write a program that ask user to enter his/her
    firstname and lastname. Display the number of
    characters by assigning a variable.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lutfen isminizi giriniz: ");
        String name = sc.nextLine();

        System.out.print("Lutfen soy isminizi giriniz: ");
        String lastName = sc.nextLine();

        int nameLength = name.length();
        int lastNameLength = lastName.length();
        System.out.println("nameLength = " + nameLength);
        System.out.println("lastNameLength = " + lastNameLength);
    }

}
