package Ders_Tekrar.Galeri;

import java.util.ArrayList;

public class Galeri {
    private static String galeriIsim = "Oran";
    private static String galeriAdres = "Amasya / Suluova";
    private static ArrayList<Araba> arabalar = new ArrayList<>();

    static {
        System.out.println(galeriIsim + " galerisi");
        System.out.println(galeriAdres);
        System.out.println("**********************");
        System.out.println();
    }
    public static void listByName(String name){
        int counter =0;
        for (Araba araba:arabalar) {
            if (araba.getIsim().equalsIgnoreCase(name)){
                counter++;
                System.out.println(araba);
            }
        }
        if (counter == 0){
            System.out.println("Galerimizde " + name + " markali arac bulunmamaktadir" );
        } else System.out.println("Galerimizde " + name + " markali " + counter + " adet arac bulunmaktadir" );
    }
    public static void listByVites(String vites){
        int counter =0;
        for (Araba araba:arabalar) {
            if (araba.getVites().equalsIgnoreCase(vites)){
                counter++;
                System.out.println(araba);
            }
        }
        if (counter == 0){
            System.out.println("Galerimizde " + vites + " vites arac bulunmamaktadir" );
        } else System.out.println("Galerimizde " + vites + " vites " + counter + " adet arac bulunmaktadir" );
    }

    public static void listByRenk(String renk) {
        int counter = 0;
        for (Araba araba : arabalar) {
            if (araba.getRenk().equalsIgnoreCase(renk)) {
                counter++;
                System.out.println(araba);
            }
        }
        if (counter == 0){
            System.out.println("Galerimizde " + renk + " te arac bulunmamaktadir");
        }else System.out.println("Galerimizde " + renk + " renkte " + counter + " adet arac bulunmaktadir");
    }

    public static void listByfiyat(double deger, double sonDeger){
        int counter = 0;
        for (Araba araba : arabalar){
            if (deger <= araba.getFiyat() && sonDeger >= araba.getFiyat()){
                counter++;
                System.out.println(araba);
            }
        }
        if (counter == 0){
            System.out.println("Galerimizde " + deger + " ile " +sonDeger + " araliginda arac bulunmamaktadir");
        }else System.out.println("Galerimizde " + deger + " ile "+ sonDeger + " araliginda "+ counter + " adet arac bulunmaktadir");
    }

    public static String getGaleriIsim() {
        return galeriIsim;
    }

    public static String getGaleriAdres() {
        return galeriAdres;
    }
    public static ArrayList<Araba> getArabalar() {
        return arabalar;
    }
    public static void addAraba(Araba araba){
        arabalar.add(araba);
    }
    public static void showArabalar(){
        System.out.println(galeriIsim + " galerimize hos geldiniz");
        System.out.println("-------------------------------------");
        for (Araba araba:arabalar) {
            System.out.println("araba = " + araba);
        }
    }

}
