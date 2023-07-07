package dersler.gun11_ControlFlowStatements_SwitchCase;

import java.util.Scanner;

public class Nested_If_Example1 {
    public static void main(String[] args) {
        Scanner veriGir = new Scanner(System.in);
        int age,weight;

        System.out.print("Lutfen Yasinizi giriniz : ");
        age = veriGir.nextInt();

        System.out.print("Lutfen kilonuzu giriniz : ");
        weight = veriGir.nextInt();

        if ( (age >= 18) && (age < 70) ){
            System.out.println("Yasiniz 18 den buyuk...");
            if( (weight >= 50) && (weight < 350) ){
                System.out.println("Yasiniz kilonuz kan vermeye uygundur");
            }else System.out.println(age + " yasindasiniz ve " +weight+ " kilodasiniz. "+
                    " Yasiniz uzgun ancak kilounuz kan vermeye uygun degildir !!!");
        }else System.out.println(age + " yasindasiniz ve yasiniz kan vermeye uygun degil !!!");
    }
}
