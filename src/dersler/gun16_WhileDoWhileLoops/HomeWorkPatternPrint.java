package dersler.gun16_WhileDoWhileLoops;

public class HomeWorkPatternPrint {
    public static void main(String[] args) {

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        int num = 5;
        for (int i = 1; i <= num; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }

        }
        System.out.println();
         /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */
        num = 5;
        for (int i = 1; i <= num; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        num = 5;
        for (int i = 1; i <= num; i++) {
            System.out.println();
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
          /*
            1
            2 2
            3 3 3
            4 4 4 4
            5 5 5 5 5
         */
        num = 5;
        for (int i = 1; i <= num; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
