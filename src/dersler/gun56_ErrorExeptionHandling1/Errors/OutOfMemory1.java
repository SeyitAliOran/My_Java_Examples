package dersler.gun56_ErrorExeptionHandling1.Errors;

public class OutOfMemory1 {
    public static void main(String[] args) {
        String str = "Merhaba Java";
        System.out.println(str);
        // Error --> OutOfMemoryError ___hatasini try catch ile duzenleyebiliriz
        while (true){
            try{
                str +=str;
            }catch (OutOfMemoryError hata){
                System.out.println("Bir hata olustu: " + hata.getMessage()); // hata.getMessage() bu sekilde hatayi cagirabiliyoruz
             //   hata.printStackTrace(); // bu method ile hatanin  butun detaylarini listeler
              //  break;
                System.exit(999); // System 999 hatasi ile cikis yapar...
            }
            catch (Error hata){
                System.out.println("Baska bir hata olustu: " + hata.getMessage());
            }
        }
    }
}
