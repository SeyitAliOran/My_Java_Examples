package dersler.gun15_ForLoop2;

public class ForLoopcarpimTablosu1 {
    public static void main(String[] args) {
        //int sayi = 1;
        for (int sayi = 1; sayi <= 10 ; sayi++) {
            if(sayi == 6 || sayi == 9 || sayi == 10) {
                System.out.println(sayi + " larin carpim tablosu");
            }else System.out.println(sayi + " lerin carpim tablosu");

            System.out.println("----------------------");
            for (int i = 1; i <= 10 ; i++) {
                System.out.println(sayi + " * "+ i + " = " +(sayi * i));
        }
            System.out.println("--------------");

        }

    }
}
