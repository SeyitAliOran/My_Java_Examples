package Alistirmalarim;

public class operatorler {
    public static void main(String[] args) {
        int a= 10;
        int b =5;
        int toplam=   a+b;
        int cikarma = a-b;
        int carpma =  a*b;
        int bolme =  a/b;
        int mod = a%b;
        System.out.println("Toplam =" + toplam);
        System.out.println("Cikarma =" + cikarma);
        System.out.println("Carpma =" + carpma);
        System.out.println("Bolme =" + bolme);
        System.out.println("Mod =" + mod);

        toplam++; // toplam degerinden 15 1 artirilir
        System.out.println("Toplam = " + toplam);
        cikarma--; // cikarma degeri 5 1 eksiltilir
        System.out.println("Cikarma = " + cikarma);
        int sonuc = a++ + b--; //once a ve b toplanir sonra toplamdan 1 artirip 1 eksiltilir
        System.out.println("Sonuc = " + sonuc);

        int sayi1 = 10;
        int sayi2 = 5;
        boolean kosul = (sayi1/sayi2) == 2; // sayi1 bolu sayi2 bu sonuca esitse True degilse False
        System.out.println("Kosul = " + kosul);// sayi1 bolu sayi2 bu sonuca esitse True degilse False

        boolean kosul1 = (sayi1>sayi2);
        boolean kosul2 = (sayi2>sayi1);
        boolean sonuc2 = kosul1 && kosul2; //kosul 1 ve kosul2 nin de sonucunu dogru olursa TRUE oluyor
        System.out.println("Souc2 = " + sonuc2);

        sonuc2 = kosul1 || kosul2; // veya operatoru: Kosul bir veya kosul 2 den bir tanesi dogru olmasi yeterli
        System.out.println("Sonuc2 = " + sonuc2);

    }
}
