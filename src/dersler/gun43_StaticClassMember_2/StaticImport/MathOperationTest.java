package dersler.gun43_StaticClassMember_2.StaticImport;

// burada static olarak classi import ettik ve en sona * koyuyoruz
import static dersler.gun43_StaticClassMember_2.StaticImport.MathOperations.*;
public class MathOperationTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

      /* int sum = MathOperations.add(num1,num2);
        int difference = MathOperations.substract(num1,num2);
        int product = MathOperations.multiply(num1,num2);
        int division = MathOperations.devide(num1,num2);
       */

        // MathOperations class ini static olarak import ettigimizden dolayi tekrar telrar class ismini girmeye gerek kalmiyor
        int sum =add(num1,num2);
        int difference = substract(num1,num2);
        int product = multiply(num1,num2);
        int division = devide(num1,num2);

        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("division = " + division);

        System.out.println("MathOperations.constantNumber = " + MathOperations.constantNumber); // Class uzerinden de ulasabiliyoruz
        System.out.println("constantNumber = " + constantNumber); // Class ismi belirtmeden direkt degiskene ulasabiliyoruz.

    }
}
