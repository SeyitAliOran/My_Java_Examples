package dersler.gun56_ErrorExeptionHandling.Exeptions;

public class MultipleException {
    public static void main(String[] args) {
        int sayi = 100;
        int bolen = 10;
        int sonuc=0;
        int[] dizi = new int[3];
       try{
           sonuc = sayi/bolen;
           System.out.println("sonuc: " + sonuc);
           System.out.println("dizi[2] = " + dizi[2]);
           System.out.println("dizi[6] = " + dizi[6]); // Error --> Index 6 out of bounds for length 3
       }catch (ArithmeticException e){
           System.out.println("Error : " + e.getMessage()); // eger bolen 0 ise Error / by zero
       }catch (ArrayIndexOutOfBoundsException e){ // Error --> Index 3 out of bounds for length 3
           System.out.println("Array Error = " + e.getMessage());
       }catch (Exception e){
           System.out.println("Array Error = " + e.getMessage()); // eger hatayi yukardakiler yakalayamaz ise burada yakalanir
       }
       finally {
           System.out.println("Finally block is executed"); // Finally block hata olmamasina ragmen yine de calisir
       }

    }

}
