package dersler.gun26_Random_Math_Date_Classes;

public class MathExample {
    public static void main(String[] args) {
        System.out.println("Math.min(3,7) = " + Math.min(3, 7));
        System.out.println("Math.max(456,2312) = " + Math.max(456, 2312));
        System.out.println("Math.pow(2,2) = " + Math.pow(2, 2)); //üslü sayılar---> 2 üzeri 2 ---> 2 * 2
        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3)); // 2 * 2 * 2
        System.out.println("Math.sqrt(25) = " + Math.sqrt(25)); //Karakök

        System.out.println("Math.PI = " + Math.PI); //PI sabiti

        double daireAlani = 2 * 2 * Math.PI; //Math.PI = 3.141592653589793
        System.out.println("daireAlani = " + daireAlani);
        System.out.println("Math.round(daireAlani) = " + Math.round(daireAlani));
    }
}
