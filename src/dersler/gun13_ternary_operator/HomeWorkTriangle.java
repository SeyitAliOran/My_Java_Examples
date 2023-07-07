package dersler.gun13_ternary_operator;

public class HomeWorkTriangle {
    public static void main(String[] args) {
        int aci1 = 30;
        int aci2 = 70;
        int aci3 = 50;

        String ucgenMi = (aci1+aci2+aci3 == 180) ? "Ucgendir." : "Ucgen degildir.";
        System.out.println("Ucgen mi = " + ucgenMi);
    }
}
