package dersler.gun56_ErrorExeptionHandling.Exeptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        int sayi1 = 154;
        int bolen = 0;
        // sifira bolunme hatasi vereceginden try catch ile hatayi duzenleriz
        System.out.println("Test started");
        try{
            System.out.println("Sonuc = " + (sayi1/bolen));
        }catch (ArithmeticException hata){
            System.err.println("Sifira bolunme hatasi olustu !!!"); // .err ile ekrana kirmizi sekilde yazar
            System.out.println("Hata = " + hata.getMessage());
          //  hata.printStackTrace();
        }
        System.out.println("Test ended");

    }
}
