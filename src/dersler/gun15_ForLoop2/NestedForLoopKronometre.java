package dersler.gun15_ForLoop2;

public class NestedForLoopKronometre {
    public static void main(String[] args) {
        System.out.println("Nested for loop ile kronemetre....");
        long bekle =0;
        for( int saat = 19; saat < 24; saat++){
            for (int dakika = 24; dakika < 60; dakika++) {
                for (int saniye = 0; saniye < 60; saniye++) {
                    for (int salise = 0; salise < 100; salise++) {
                        System.out.print("\r" + saat + " : " + dakika + " : " + saniye + " : " + salise);// yan yana cok fazla oldugundan \r ile bir satir siliyoruz...
                        for (int counter = 0; counter < 35_000_000; counter++) { // amacimiz saliseyi yavaslatmak
                            bekle +=counter;
                        }
                        bekle = 0;
                    }

                }

            }
        }

    }
}
