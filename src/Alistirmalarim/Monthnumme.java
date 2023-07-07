package Alistirmalarim;

import java.util.Scanner;

public class Monthnumme {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String choice = s.next();
        double price = 0;

        if(choice.equals("coffie") || choice.equals("coke") || choice.equals("juice")){
            price = 4.0;

        }else if (choice.equals("soda")){
            price = 2.0;
        }
        System.out.println(choice + " " +price + " $");
    }
}
