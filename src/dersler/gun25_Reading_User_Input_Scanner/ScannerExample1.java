package dersler.gun25_Reading_User_Input_Scanner;

import java.util.Scanner;

public class ScannerExample1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yasinizi giriniz : ");
        int age = input.nextInt();

        input.nextLine(); //bos bir nextLIine kendinden once hafizada kalanlari siler.
        System.out.print("Adinizi giriniz : ");
        String name = input.nextLine();



        System.out.println("Adiniz : " +name+ " yasiniz : "+age);
    }
}
