package dersler.gun20_Methods2;

public class MethodPrimeNumber {
    public static void main(String[] args) {
        // Find prime numbers between two numbers.

        asalSayiYaz(3,333);


    }

    public static boolean asalMi(int sayi) {
        for (int i = 2; i < sayi  ; i++) { // Best wáy i<= sayi/2 bu sekilde islem sayisi yari yariya azalir
            if (sayi % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void asalSayiYaz(int start, int end) {
        int counter = 0;
        for (int i = start; i < end; i++) {
            if (asalMi(i)) {
                counter++;
                System.out.printf("%5d", i); // printf %5d ile yan tarafa 5 bosluk birakir
                if (counter % 10 == 0) { // her 10 defa da asagi satira gecer
                    System.out.println();
                }
            }

        }
    }

}
