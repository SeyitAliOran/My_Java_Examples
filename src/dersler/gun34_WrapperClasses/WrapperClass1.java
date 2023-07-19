package dersler.gun34_WrapperClasses;

public class WrapperClass1{
    public static void main(String[] args) {
        int num1 = 5;
        Integer num2 = new Integer(5);
        Integer num3 = new Integer("5");
        Integer num4 = new Integer(num1);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

    }
}
