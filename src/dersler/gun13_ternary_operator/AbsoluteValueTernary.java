package dersler.gun13_ternary_operator;

public class AbsoluteValueTernary {
    public static void main(String[] args) {

        // Bir sayinin mutlak degerini dogru olarak gosteren Ternary yaziniz...

        int x = -10;

        int mutlakDeger = (x > 0) ? x : -x;
        System.out.println("mutlakDeger = " + mutlakDeger);
    }
}
