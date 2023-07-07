package dersler.gun018_Branching_Labelled_Statements;

public class SumOfOddnumbers {
    public static void main(String[] args) {
        // 0 dan baslayarak verilen rakama kadar olan tek sayilarin toplamini bulunuz
        // toplami cift sayilari disarda birakarak yapiniz
        int number = 10;
        int sum = 0;
        for (int i = 0; i <=number ; i++) {
            if(i %2 == 0){
                continue; // cift rakamalari atliyoruz...
            }
            sum += i; // kalan tek rakamlari topluyoruz...

        }
        System.out.println(sum);

    }
}
