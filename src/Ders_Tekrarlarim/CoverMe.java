package Ders_Tekrarlarim;

import java.util.Scanner;

public class CoverMe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String main = in.nextLine();
        String coverMe = in.nextLine();
        System.out.println(coverString(main, coverMe));
    }

    public static String coverString(String main, String coverME) {
        if (main.contains(coverME)){
            return main.replaceAll(coverME,"["+coverME+"]");
        }else {
            return "[" + main + "]";
        }
    }

}
