package dersler.gun57_ErrorExeptionHandling2.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter the numerator : ");
            int numerator = scanner.nextInt(); // bolunen sayi

            System.out.print("Enter the denumerator : "); // bolen sayi
            int denumerator = scanner.nextInt();

            int result = numerator / denumerator;
            System.out.println("Result of division : " + result);
            System.out.println();

            int[] numbers = {1,2,3};
            System.out.print("Enter an index number to get number from the Array : ");
            int index = scanner.nextInt();
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);

        }catch (InputMismatchException e){
            // int yerine baska bir deger girildiginden / "asa"
            System.out.println("InputMismatchException: " + e.getMessage());
        }catch (ArithmeticException e){
            // bolne sayisi denumerator 0 girildiginde  / denumerator = 0;
            System.out.println("ArithmeticException: " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            // index degerine karsili bir degisken olmayan deger girildiginde / [5]
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }


    }
}
