package dersler.gun24_Memory_Garbage_Collection;

public class ProductTest {
    public static void main(String[] args) {
        Product urun1 = new Product();
        Product urun2 = new Product();
        // urun1 heap memoryde olusan nesnenin referansini/adresini barindiran
        // ve stack memoryde olusan bur degisken
        System.out.println(urun1); // Prints the adress of object which is created in heap memory

        urun1.name = "Elma"; // Heap memory de bulunuyor
        urun1.unitPrice = 15; // Heap memory de bulunuyor
        urun1.amount = 5; // Heap memory de bulunuyor
        System.out.println(urun1.name + " -Kdv siz fiyat = " + urun1.fiyatHesapla()); // Heap memory de bulunuyor
        System.out.println(urun1.name + " -Kdv li fiyat  = " + urun1.kdvHesapla()); // Heap memory de bulunuyor

        System.out.println();

        urun2.name = "Peynir"; // Heap memory de bulunuyor
        urun2.unitPrice = 95; // Heap memory de bulunuyor
        urun2.amount = 1.5; // Heap memory de bulunuyor
        System.out.println(urun2.name + " -Kdv siz fiyat = " + urun2.fiyatHesapla()); // Heap memory de bulunuyor
        System.out.println(urun2.name + " -Kdv li fiyat  = " + urun2.kdvHesapla()); // Heap memory de bulunuyor

        System.out.println();

        birMethod(); // Stack de yer alir.

        System.out.println();

        urun1 = null; // NULL urun1 e artik ihtiyacimin olmadigini ve ona bir sey referans edilmedigini gosterir.

        urun2 = null; // NULL urun2 e artik ihtiyacimin olmadigini ve ona bir sey referans edilmedigini gosterir.

        System.gc(); // Garbage collection cagirmak icin.

    }
    public static void birMethod(){
        System.out.println("I am a method");
    }
}
