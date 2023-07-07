package dersler.gun17_Review;

public class UniqueNumberIfElseTernary {
    public static void main(String[] args) {
        // verilen uc sayi arasindaki farkli sayi adedini bulan program
        int sayi1 = 1;
        int sayi2 = 2;
        int sayi3 = 3;
        int result = 0;

        if (sayi1 == sayi2 && sayi2 == sayi3) {
            result = 1;
        } else if (sayi1 == sayi2 || sayi1 == sayi3 || sayi2 == sayi3) {
            result = 2;
        } else {
            result = 3;

            System.out.println("result = " + result);

result = (sayi1 == sayi2 && sayi2 == sayi3) ? 1 :  (sayi1 == sayi2 || sayi1 == sayi3 || sayi2 == sayi3) ? 2:3;
            System.out.println("result = " + result);
        }

    }
}