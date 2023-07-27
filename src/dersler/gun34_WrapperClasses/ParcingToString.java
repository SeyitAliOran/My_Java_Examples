package dersler.gun34_WrapperClasses;

public class ParcingToString {
    public static void main(String[] args) {
        // Bir primitive degeri Stringe bu sekillerde degistirilir.
        // 1. method
        Integer num = new Integer(123);
        String num2 = String.valueOf(num);
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
        System.out.println();
        // 2. method
        int num3 = 1234;
        String strNum = String.valueOf(num3);
        System.out.println("num3 = " + num3);

        num = num +1;
        num2 = num2+1;
        num3 = num3+1;
        strNum = strNum+1;
        System.out.println("num = " + num); // 124
        System.out.println("num2 = " + num2); // 1231
        System.out.println("num3 = " + num3); // 1235
        System.out.println("strNum = " + strNum); // 12341
        System.out.println();

        Integer num4 = 123;
        String num5 = Integer.toString(num4);
        System.out.println("num4 = " + num4); // 123
        System.out.println("num5 = " + num5); // 123

        num4 =num4+1;
        num5 = num5+1;
        System.out.println("num4 = " + num4); // 124
        System.out.println("num5 = " + num5); // 1231

    }
}
