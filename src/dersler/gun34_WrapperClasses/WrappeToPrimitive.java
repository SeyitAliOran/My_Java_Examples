package dersler.gun34_WrapperClasses;

public class WrappeToPrimitive {
    public static void main(String[] args) {
        // Wrapper data turlerini primitive cevirme

        Integer obj1 = Integer.valueOf(23);
        Double obj2 = Double.valueOf(25.5);
        Boolean obj3 = Boolean.valueOf(false);
        int num3 = obj2.intValue(); // double value int value cevirdik bu yuzden data kayboluyor...---> 25
        double num4 = obj1.doubleValue(); // int value double value cevirdik----> 23.0

        int num1 = obj1.intValue();
        double num2 = obj2.doubleValue();
        boolean b = obj3.booleanValue();
        System.out.println("b = " + b);
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);
    }
}
