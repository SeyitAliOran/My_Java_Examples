package dersler.gun16_WhileDoWhileLoops;

public class WhileLoopExercises1 {
    public static void main(String[] args) {
        // 20 den 30 a kadar buyuk oldugu surece ekrana in the loop yaz

        int number = 30;
        int counter = 0;
        while (number>20){
            counter ++;
            System.out.println(counter + " -in the loop");
            number--;
        }
        System.out.println("\nThis loop run" + counter + " times");
    }
}
