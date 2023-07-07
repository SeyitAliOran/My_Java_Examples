package dersler.gun13_ternary_operator;

public class NestedTernary {
    public static void main(String[] args) {

        // Ternary operatorunun ic ice kullanimi ve if ile karsilastirilmasi konusu....
        int x = 2;
        char ch;
        if (x > 2) {
            if (x > 5) {
                ch = 'A';
            }else {
                ch = 'B';
            }
        } else {
            ch = 'C';
        }
        System.out.println("ch = " + ch);

        ch = (x > 2) ? ((x > 5)  ? 'A' : 'B'): 'C';
        System.out.println("ch = " + ch);
        System.out.println();

        // Buyuk rakami bul
        // ikili karsilastirma

        int a = 6;
        int b = 5;

        int larger = (a>b) ? a : b ;
        System.out.println("larger = " + larger);
        System.out.println();
        System.out.println();

        // Uclu karsilastirma

        int num1 = 15;
        int num2 = 12;
        int num3 = 24;

        //             (Condition)           (Expression 1)                  (Expression 2)
        //                              (Condition)    (Ex1) (Ex1)     (Condition)     (Ex1) (Ex1)
        int largest = (num1 > num2) ? ((num1 > num3) ? num1: num3) : ((num2 > num3) ? num2 : num3) ;
        //largest = num1>num2?num1>num3?num1:num3:num2>num3?num2:num3;
        System.out.println("largest = " + largest);
    }
}
