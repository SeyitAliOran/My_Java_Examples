package Ders_Tekrarlarim;

import dersler.gun12_SwitchCaseStatements_SwitchCase.SwitchCase;

import java.util.Scanner;

public class SwitchCaseKanallar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen 1... 4 arasi bir tusa basiniz = ");
        int tus = scanner.nextInt();
        switch (tus){
            case 1:
            System.out.println("Kanal TRT");
            break;
            case 2:
                System.out.println("Kanal SHOW");
            break;
            case 3:
                System.out.println("Kanal KANAL D");
                break;
                case 4:
                System.out.println("Kanal STAR");
                break;
            default:
                System.out.println("Gecersiz bir tusa basdiniz...");
        }
    }
}
