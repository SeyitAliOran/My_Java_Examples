package dersler.gun34_WrapperClasses;

public class WrapperConstants {
    public static void main(String[] args) {

        // Sabit(FINAL) bir deger olduklarindan dolayi farkli bir deger assign edilemez....
        // Degistirilemez
        //Byte.MIN_VALUE=125;
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        int minValue = Integer.MIN_VALUE; // Bu sekilde bir degiskene assign edebiliriz
        System.out.println("minValue = " + minValue);

        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);



    }
}
