package dersler.gun26_Random_Math_Date_Classes;

public class MathRoundingNumbers {
    //Math.round() rounds up to larger number

    public static void main(String []args)
    {
        System.out.println("Math.round() of 9.5 is  --> " + Math.round(9.5));
        System.out.println("Math.round() of 10.5 is --> " + Math.round(10.5));
        System.out.println("Math.round() of 11.5 is --> " + Math.round(11.3));
        System.out.println("Math.round() of 12.5 is --> " + Math.round(12.75));
        System.out.println("Math.rint() of 9.5 is   --> " + Math.rint(9.5)); // 0.5 olursa Çift sayıya yakın yuvarlar. Yuvarladığında çift olacaksa yukarı değilsse aşağı yuvarlar.
        System.out.println("Math.rint() of 10.5 is  --> " + Math.rint(10.5));// 0.5 olursa Çift sayıya yakın yuvarlar. Yuvarladığında çift olacaksa yukarı değilsse aşağı yuvarlar.
        System.out.println("Math.rint() of 11.5 is  --> " + Math.rint(11.5));// 0.5 olursa Çift sayıya yakın yuvarlar. Yuvarladığında çift olacaksa yukarı değilsse aşağı yuvarlar.
        System.out.println("Math.rint() of 12.5 is  --> " + Math.rint(12.5));// 0.5 olursa Çift sayıya yakın yuvarlar. Yuvarladığında çift olacaksa yukarı değilsse aşağı yuvarlar.
        System.out.println("Math.int()  of 15.5     --> " + Math.rint(14.5));
        System.out.println("Math.ceil(10.1)         --> " + Math.ceil(10.1)); //Her halukarda yukarı yuvarlar
        System.out.println("Math.floor(10.9)        --> " + Math.floor(10.9)); // Her halukarda aşağı yuvarlar.
    }
}
