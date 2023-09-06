package dersler.gun57_ErrorExeptionHandling2.ThrowsWithMethods.Math;

public class SimpleMathTest {
    // SimpleMath classinda methodu exception firlattik(Throw)
    // SimpleMathTest classinda ise yani methodun cagirilan classinda
    // Exception edilen method HANDLE edilmek gerekiyor.
    public static void main(String[] args) {

        int result;
        try {
            result = SimpleMath.divide(10,2);
            System.out.println("result = " + result);

            result = SimpleMath.divide(10,0);
            System.out.println("result = " + result);
        }catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
