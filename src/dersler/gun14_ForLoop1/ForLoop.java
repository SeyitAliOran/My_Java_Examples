package dersler.gun14_ForLoop1;

public class ForLoop {
    public static void main(String[] args) {

        // int i = 0; ----> sayac tanimi ve baslangic degeri atama
        // i < 20; ----> döngü devam kosulu
        // i++ ----> her tekrar sonrasi sayacin degerinin artirildigi/azaltildigi
        for (int i = 0; i < 5; i++) {
            System.out.print("Merhaba for loop." + " ");
        }
        System.out.println("\n");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "-Merhaba "); // sartlar olusana kadar tekrar eder

        }
        System.out.println();
        // Ekrana 1-10 arasi sayilari ekrana yazan for loop dongusu yaziniz ?
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Ekrana 10-1 arasi sayilari ekrana yazan for loop dongusu yaziniz ?
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Ekrana 1-10  arasi sayilari ekrana yazan for loop dongusu yaziniz ?
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // bazi durumlarda for dongusunun icine 1 den fazla degisken atayabiliriz...
        int counter = 1;
        for (int sayi = 0; sayi <= 10; sayi+=2){
            System.out.println("Counter = " + counter);
            System.out.println("Cift sayi = " + sayi);
            counter ++;
        }


    }
}
