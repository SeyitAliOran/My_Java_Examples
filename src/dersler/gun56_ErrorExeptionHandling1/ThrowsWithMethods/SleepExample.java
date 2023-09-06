package dersler.gun56_ErrorExeptionHandling1.ThrowsWithMethods;

public class SleepExample {
    public static void main(String[] args) {
        // Cagirildigi yerde hemen  try catch ile handle etmek gerekiyor.Yoksa hata verir
        try {
            System.out.println("Before sleeping...");
            sleepForSeconds(5);
            System.out.println("After sleeping...");
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught: " + e.getMessage());
        }
    }
    public static void sleepForSeconds(int seconds) throws InterruptedException {
        System.out.println("Sleeping for " + seconds);
        // Bu Thread.sleep method calistiginda belirtilen sure kadar beklenir.
        // Bu exeption firlatir. Methodun hemen sonuna alinacak Exception eklenir
        Thread.sleep(seconds * 1000 );//1000 milisaniye bekleyecek
    }
}
