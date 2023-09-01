package dersler.gun54_Polymorphism2.CallingMethod;

import java.util.ArrayList;
import java.util.Arrays;

public class SekilGrup {
    public static void main(String[] args) {
       Sekil[] sekiller = new Sekil[3];
       sekiller[0] = new Kare();
       sekiller[1] = new Ucgen();
       sekiller[2] = new Daire();
       for (Sekil sekil : sekiller){
           System.out.println(sekil.getClass().getName());
           sekil.ciz();
       }
        System.out.println("////////////////////////////");
        ArrayList<Sekil> sekilList = new ArrayList<>();
        sekilList.add(new Kare());
        sekilList.add(new Ucgen());
        sekilList.add(new Daire());
        for (Sekil list : sekilList){
            System.out.println(list.getClass().getSimpleName());
            if (list.getClass().getSimpleName().equals("Kare")){
                list.ciz(); // Kare yi yakaladiginda ciz metodunu cagiriyor
            }else if (list.getClass().getSimpleName().equals("Ucgen")){
                list.ciz(); // Ucgen i yakaladiginda ciz metodunu cagiriyor
            }else if (list.getClass().getSimpleName().equals("Daire")){
                list.ciz(); // Daire yi yakaladiginda ciz metodunu cagiriyor
            }
        }
    }
}
