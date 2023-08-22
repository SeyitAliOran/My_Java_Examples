package dersler.gun45_Inheritance2.KekTarifi;

public class KekTest {
    public static void main(String[] args) {
        Kek sadeKek = new Kek();
        sadeKek.name ="Sade Kek";
        sadeKek.seker = 1; // bardak
        sadeKek.un = 2; // bardak

        CevizliKek cevizliKek = new CevizliKek(); // Her obje olustuginda Ana Kek de ki Constructor otomatik olarak gelir
        cevizliKek.name = "Cevizli Kek";
        cevizliKek.seker = 1;
        cevizliKek.un = 2;
        cevizliKek.sut = 3;
        cevizliKek.ceviz = 250; // Gram

        CevizliKek cevizliKek1 = new CevizliKek(350,"Cevizli Kek",2,1,3,3,2,3,2);

        CikolataliKek cikolataliKek =new CikolataliKek();
        CikolataliKek cikolataliKek1 = new CikolataliKek(450,"Cikolatali Kek",2,1,3,3,2,3,2);
        cikolataliKek.name = "Cikolatali Kek";
        cikolataliKek.seker = 1;
        cikolataliKek.un = 2;
        cikolataliKek.sut = 3;
        cikolataliKek.cikolata = 450; // Gram

        System.out.println(sadeKek);
        System.out.println(cevizliKek1);



        Firin firin = new Firin(180,45);
        firin.tepsiyeEkle(sadeKek);
        firin.tepsiyeEkle(cevizliKek1);
        firin.tepsiyeEkle(cikolataliKek1);

        firin.showTepsiler();


    }
}
