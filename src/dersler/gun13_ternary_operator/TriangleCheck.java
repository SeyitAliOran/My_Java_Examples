package dersler.gun13_ternary_operator;

import java.nio.charset.UnmappableCharacterException;

public class TriangleCheck {
    public static void main(String[] args) {

        // Ucgenin cesidini tespit etme programi

        int aci1 = 60 ;
        int aci2 = 60 ;
        int aci3 = 60 ;

        String ucgenTuru;

        if (aci1 == aci2 && aci2 == aci3){
            ucgenTuru = " Eskenar Ucgen";
        }else if (aci1 == aci2 || aci1 == aci3 || aci2 == aci3){
            ucgenTuru = "Ikizkenar ucgen";
        }else {
            ucgenTuru = "Cesitkenar ucgen";
        }
        System.out.println("IfELse ucgenTuru = " + ucgenTuru);
        System.out.println();

        ucgenTuru = (aci1 == aci2 && aci2 == aci3) ? " Eskenar Ucgen" : (aci1 == aci2 || aci1 == aci3 || aci2 == aci3) ? "Ikizkenar ucgen" : "Cesitkenar ucgen";
        System.out.println("Ternary ucgenTuru = " + ucgenTuru);
    }
}
