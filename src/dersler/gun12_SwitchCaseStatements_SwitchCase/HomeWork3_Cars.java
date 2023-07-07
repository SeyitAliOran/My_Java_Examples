package dersler.gun12_SwitchCaseStatements_SwitchCase;

import java.util.Scanner;

public class HomeWork3_Cars {
    public static void main(String[] args) {
        Scanner arabaGir = new Scanner(System.in);
        String arabaModeli = "";
        System.out.print("Bir araba modeli giriniz : ");
        arabaModeli = arabaGir.nextLine();

        switch (arabaModeli){
            case "Mercedes" :
                System.out.println("\"Good one\"");
                break;
            case "Volvo" :
                System.out.println("\"Tough one\"");
                break;
            case "Opel" :
                System.out.println("\"Not bad \"");
                break;
            case "Sahin" :
                System.out.println("\"Not recommended\"");
                break;
            default:
                System.out.println("Yanlis bir araba modeli girdiniz...");


        }

    }
}
