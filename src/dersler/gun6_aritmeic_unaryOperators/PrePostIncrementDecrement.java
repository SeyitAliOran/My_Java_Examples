package dersler.gun6_aritmeic_unaryOperators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        
        int x = 5;
        int y = x++; // x in eski degeri assign edilip daha sonraki gorunumunde artirilir.

        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 5


    }
}
