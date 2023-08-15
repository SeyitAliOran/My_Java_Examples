package dersler.gun43_StaticClassMember_2.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {

        // Methodlari static yaparak ana islemde methodlara hem direkt hemde object olusturarak ulasabiliriz.

       double result = Calculator.plus(2,3); // static way of calling method
        System.out.println("result = " + result);

        double result2 = Calculator.minus(20,3);
        System.out.println("result2 = " + result2);

        Calculator obj = new Calculator();
        double result3 = obj.devide(6,3); // calling static method via object
        System.out.println("result3 = " + result3);
    }
}
