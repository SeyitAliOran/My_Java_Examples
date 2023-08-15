package Ders_Tekrar;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        // 0 dan baslayarak verilen rakama kadar olan tek sayilarin toplamini bulunuz
        // toplami cift sayilari disarda birakarak yapiniz
        int number = 5;
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (i %2 == 0){
                continue;
            }
            sum +=i;
        }
        System.out.println(sum);
    }
}
