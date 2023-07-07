package dersler.gun15_ForLoop2;

public class ForLoopTriangleNumber {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows ; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();

        for (int i = rows; i > 0; i--) {
            System.out.println();
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");

            }

        }
    }
}
