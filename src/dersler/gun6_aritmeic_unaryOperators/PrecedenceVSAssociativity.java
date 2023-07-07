package dersler.gun6_aritmeic_unaryOperators;

public class PrecedenceVSAssociativity {
    public static void main(String[] args) {

        // Java matematikteki islem onceligine gore hareket ediyor

        System.out.println(3+5*7);
        System.out.println(42-15/3);
        System.out.println(8+2*3-21/7+6);
        System.out.println(4+42/2*3);
        System.out.println(6-3*3+6-8);

        //Java parantez onceligini de en oncelikli islem olarak uygular.
        System.out.println(3+4*4+5*(4+3)-1);

        //Birden fazla parantez varsa islem onceligi icten disari dogrudur.
        System.out.println(3+4*4+5*(4+(3+2)-1));
    }
}
