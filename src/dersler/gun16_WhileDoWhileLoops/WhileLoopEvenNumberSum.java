package dersler.gun16_WhileDoWhileLoops;

public class WhileLoopEvenNumberSum {
    public static void main(String[] args) {
        // 0-100 arasindaki cift sayilarin toplamini yazan program
        int number = 0;
        int sum = 0;
        while (number < 10){
            if(number %2 == 0){
                sum +=number;
            }

            number++;
        }
        System.out.println("sum of even numbers = " + sum);
            sum =0;
        for (int i = 0; i < 10; i++) {
            if(i %2 == 0){
                sum +=i;
            }
        }System.out.println("sum of even numbers = " + sum);
    }
}
