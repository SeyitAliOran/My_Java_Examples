package dersler.gun26_Random_Math_Date_Classes;

import Alistirmalarim.IfElseAtmExercises;

import java.util.Random;

public class RandomYaziTura {
    public static void main(String[] args) {
        int yaziCounter = 0;
        int turaCOunter = 0;
        for (int i = 1; i <= 10; i++) {
            String atis = yaziTura();
            if (atis.equals("Yazi")) {
                yaziCounter++;
            } else turaCOunter++;
            System.out.println(i + ".Para atisi :" + atis);
        }
        System.out.println("Yazi gelen sayi = " + yaziCounter);
        System.out.println("Tura gelen sayi = " + turaCOunter);
    }

    public static String yaziTura() {
        Random rastgele = new Random();
        String result = "";
        boolean atisDeger = false;

        atisDeger = rastgele.nextBoolean(); // return true or false
       /* if (atisDeger) {
            result = "Yazi";
        } else result = "Tura";
*/
        return result = atisDeger ? "Yazi" : "Tura";
    }
}
