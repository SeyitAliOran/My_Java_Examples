package dersler.gun09_Review;

public class SinifGecme {
    public static void main(String[] args) {
        System.out.println("Sinif Gecme Notu Hesaplama Programi...\n");

        String name = "Ahmet Falanca";
        int vize1 = 70;
        int vize2 = 70;
        int finalNotu = 80;
        double sinifGecmeNotu = 0;
        boolean gectiMi = false;
        boolean A_ileMiGecti = false;
        boolean B_ileMiGecti = false;
        boolean C_ileMiGecti = false;
        boolean D_ileMiGecti = false;
        boolean F_ileMiGecti = false;

        sinifGecmeNotu = ((vize1 * 0.2) + (vize2 * 0.2)) + (finalNotu * 0.6);
        System.out.println("sinifGecmeNotu = " + sinifGecmeNotu + "\n");

       // Relational (karsilastirma) operators
        gectiMi = sinifGecmeNotu >=50;
        A_ileMiGecti = sinifGecmeNotu >= 80 && sinifGecmeNotu <=100;
        B_ileMiGecti = sinifGecmeNotu >= 70 && sinifGecmeNotu < 80;
        C_ileMiGecti = sinifGecmeNotu >= 60 && sinifGecmeNotu < 70;
        D_ileMiGecti = sinifGecmeNotu >= 50 && sinifGecmeNotu < 60;
        F_ileMiGecti = sinifGecmeNotu < 50;


        /* Logical (Mantiksal) operatorler ile yukarida ki islem yapilabilir.
        gectiMi = sinifGecmeNotu == 50 || sinifGecmeNotu > 50;*/

        System.out.println(name+ "adli ogrencinin 1. vize notu :" + vize1);
        System.out.println(name+ "adli ogrencinin 2. vize notu : " + vize2);
        System.out.println(name+ "adli ogrencinin final notu   : " + finalNotu);
        System.out.println(name + " adli ogrencinin not ortalamasi : " + sinifGecmeNotu + "\n");
        System.out.println(name + "adli ogrencinin sinif gecme durumu  : " + gectiMi + "\n");

        System.out.println("A notu ile mi gecti = " + A_ileMiGecti);
        System.out.println("B notu ile mi gecti = " + B_ileMiGecti);
        System.out.println("C notu ile mi gecti = " + C_ileMiGecti);
        System.out.println("D notu ile mi gecti = " + D_ileMiGecti);
        System.out.println("F notu ile mi gecti = " + F_ileMiGecti);



    }
}
