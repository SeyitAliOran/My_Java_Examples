package dersler.gun61_CoreReview;

public class SumOfDigits {
    public static void main(String[] args) {

        // Bir string icerisinde yer alan sadece rakamlari toplayan bir method yaziniz
        // 35asd38df3s7dfg345vvdw456h = 56

        System.out.println(sumOfDigits("35asd38df3s7dfg345vvdw456h"));
        System.out.println(sumOfDigits("d8f6g4"));
        System.out.println(sumOfDigits("aflkahsoiuoqb"));

    }

    public static int sumOfDigits(String str) {
        int total = 0;

        char[] ch = str.toCharArray();

        for (char each : ch) {
            if (Character.isDigit(each)) {
                total += Integer.parseInt("" + each);
            }
        }
        return total;
    }
}
