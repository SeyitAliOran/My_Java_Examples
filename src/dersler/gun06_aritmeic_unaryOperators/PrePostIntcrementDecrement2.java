package dersler.gun06_aritmeic_unaryOperators;

public class PrePostIntcrementDecrement2 {
    public static void main(String[] args) {

        int x = 50;
        int y = --x + x++ + x-- + x++;
        // x => 49 => 50 => 49 => 50
        // y => 49 +  49  + 50  + 49 = 197

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("  ");
        int m = 60;
        int n = m + m-- + ++m + --m + m++ + m--;
        //  m   60  59     60    59   60    59 = 59
        //  n   60  60     60    59   59    60 = 358
        System.out.println("n = " + n);
        System.out.println("m = " + m);
    }
}
