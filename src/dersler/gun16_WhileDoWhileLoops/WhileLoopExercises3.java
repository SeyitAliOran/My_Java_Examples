package dersler.gun16_WhileDoWhileLoops;

public class WhileLoopExercises3 {
    public static void main(String[] args) {
        //(a)---> infinite loop
        int i = 1;
       /* while (i < 10){
            if (i % 2 == 0){
                System.out.println("a-" + i);
            }
        }*/

        //(b) --> infinite loop
        /*System.out.println("(b)");
        while (i < 10) {
            if (i % 2 == 0) {
                System.out.println(i++);
            }
        }*/

        //(c) -->
        /*
                3
                5
                7
                9
         */
        System.out.println("(c)");
        while (i < 10) {
            if ((i++) % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
