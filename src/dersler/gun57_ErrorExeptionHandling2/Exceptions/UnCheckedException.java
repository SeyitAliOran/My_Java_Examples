package dersler.gun57_ErrorExeptionHandling2.Exceptions;

public class UnCheckedException {
    public static void main(String[] args) {
        // UnCheckedException / ClassCastException
      //  Object obj = new Object();
     //   String str = (String) obj; --> Object i stringe cast etmek istedigimizde --> Run Time Exception / ClassCastException / UnCheckedException


        /*
        UnCheckedException / NumberFormatException
        String str = "abc";
        int num = Integer.parseInt(str);  // String bbir degeri int degere cas etmek istedigimizden dolayi --> NumberFormatException
         */


       // UnCheckedException / ArithmeticException
      // System.out.println(1/0); // birsayinin sifira bolunmesinde aldigimiz --> ArithmeticException

        // UnCheckedException / ArrayIndexOutOfBoundsException
      //  int[] array = {1,2,3,4,5};
      //  System.out.println(array[6]); arraylerde listenin disinda ki deger cagirildiginda veya ona deger atandiginda ArrayIndexOutOfBoundsException


        // UnCheckedException / StringIndexOutOfBoundsException
         // String str = "abc";
         // System.out.println(str.charAt(str.length())); // indeksleme işleminin geçerli olmayan bir indeksle yapılması durumunda ortaya çıkar --> StringIndexOutOfBoundsException


        // UnCheckedException / NullPointerException
        // String str = null;
        // System.out.println(str.length()); // ici bos olan Stringin uzunlugunu olcmeye kalktigimiz da --> NullPointerException




    }
}
