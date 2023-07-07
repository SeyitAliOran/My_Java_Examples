package Alistirmalarim;

public class PrintingKarakter {
    public static void main(String[] args) {
        for (int i = 0; i <65535; i++) {
            System.out.print(i + " -> " + (char)i + " ");
            if(i %15 ==0) System.out.println();

        }
    }
}
