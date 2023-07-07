package dersler.gun08_AssignmentRelationalLogical;

public class SwappingToNumbers {
    public static void main(String[] args) {

        System.out.println("Swapping Two Numbers..."); // iki degiskeni kendi arasinda degistirme
        System.out.println("-----------------------");

        int sayiA = 12;
        int sayiB = 33;

        //1. Cozum 3. bir degisken kullanarak#
        System.out.println("1. Cozum 3. bir degisken kullanilarak");
        System.out.println("Value of Numbers before swapping...");
        System.out.println("sayiA = " + sayiA);
        System.out.println("sayiB = " + sayiB);
        int temp = 0;
        temp = sayiA;
        sayiA = sayiB;
        sayiB = temp;

        System.out.println("Value of Numbers after swapping...");
        System.out.println("sayiA = " + sayiA);
        System.out.println("sayiB = " + sayiB + "\n\n");


        // 2. Cozum bir baska degisken kullanmadan
        System.out.println("2. Cozum 3.degisken kullanmadan");
        sayiA = 12;
        sayiB = 33;
        sayiA = sayiA + sayiB;
        sayiB = sayiA - sayiB;
        sayiA = sayiA - sayiB;

        System.out.println("Value of Numbers after swapping...");
        System.out.println("sayiA = " + sayiA);
        System.out.println("sayiB = " + sayiB + "\n\n");


    }
}
