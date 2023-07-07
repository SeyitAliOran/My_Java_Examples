package dersler.gun7_TypeCasting;

public class DonusturmeOrnek {
    public static void main(String[] args) {
        int num1 = (int) (7.9) + (int) (6.7);
        System.out.println("num1 = " + num1); //13
        int num2 = (int) (7.9 + 6.7);
        System.out.println("num2 = " + num2); //14
        double num3 = (double) (17);
        System.out.println("num3 = " + num3); //17.0
        double num4 = (double) + (8+3);
        System.out.println("num4 = " + num4); // 11.0
        double num5 = (double) (7) / 2;
        System.out.println("num5 = " + num5); // 3.5
        double num6 = (double) (7/2);
        System.out.println("num6 = " + num6); // 3.0
        int num7 = (int) (7.8 + (double)(15)/2);
        System.out.println("num7 = " + num7); // 15
    }
}
