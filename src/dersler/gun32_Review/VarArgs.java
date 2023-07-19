package dersler.gun32_Review;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println("topla(2,5) = " + topla(2, 5));
        System.out.println();
        System.out.println("topla (2,3,4) = " + topla(2, 3, 4));
        System.out.println();
        System.out.println("topla = " + topla(1, 2, 3, 4));
        System.out.println();
        System.out.println("topla = " + topla("Mesaj: Variable argumnets", 1, 2, 3, 4, 5));
        System.out.println();
        System.out.println("Cumle= " + topla("Seyit", "Ali", "Rukiye", "Yusuf"));
    }

    public static int topla(int sayi1, int sayi2) {
        System.out.println("2 arguments method is invoked.");
        return sayi1 + sayi2;
    }

    public static int topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 arguments method is invoked.");
        return sayi1 + sayi2 + sayi3;
    }

    // VArargs style(with Java 5 SDK) bir methoda kac tane parametre aldigini belirtmeden yapabilen islem
    public static int topla(int... sayilar) { // Array yolu ile islem gerceklesiyor
        System.out.println("Variable arguments method is invoked.");
        int toplam = 0;
        for (int sayi :
                sayilar) {
            toplam += sayi;
        }

        return toplam;
    }

    //Varargs argument her zaman en sonda olmasi gerekiyor. IStedigimiz veri tipinde bir kisitlama yok.(... ile yapilir)
    public static int topla(String mesaj, int... sayilar) {
        System.out.println(mesaj);
        int toplam = 0;
        for (int sayi :
                sayilar) {
            toplam += sayi;
        }

        return toplam;
    }
    public static String topla(String... kelimeler){
        String cumle = "";
        for (String kelime:
             kelimeler) {
            cumle += kelime+" ";
        }
        return cumle;
    }
}
