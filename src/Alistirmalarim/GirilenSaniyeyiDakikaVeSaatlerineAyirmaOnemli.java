package Alistirmalarim;

import java.util.Scanner;

public class GirilenSaniyeyiDakikaVeSaatlerineAyirmaOnemli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int inputSeconds, hours, minutes, seconds;

        System.out.print("Enter seconds:");
        inputSeconds = scanner.nextInt();

        hours = inputSeconds / 3600;
        inputSeconds %= 3600;
        minutes = inputSeconds / 60;
        seconds = inputSeconds % 60;

        System.out.println(hours+" hours, "+minutes+" minutes, " + "and "+ seconds + " seconds");

    }
}
