package dersler.gun56_ErrorExeptionHandling1.ThrowsWithMethods.Math;

public class SimpleMath {
    // Methodun icerisinde eger Exeption olusturuluyor ise throws ile imzalamak gerekiyor
    public static int divide(int numerator, int denumerator) throws ArithmeticException{
        if (denumerator == 0){
            throw  new ArithmeticException("Division by zero is not allowed");
        }
        return numerator/denumerator;
    }
}
