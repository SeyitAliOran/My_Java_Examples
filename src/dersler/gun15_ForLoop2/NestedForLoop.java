package dersler.gun15_ForLoop2;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3 ; i++) {
            System.out.println("--------");
            System.out.println("i = " + i);
            System.out.println("--------");
            for (int j = 0; j <5 ; j++) {
                System.out.println("   j = "+  j);
            }

        }
    }
}
