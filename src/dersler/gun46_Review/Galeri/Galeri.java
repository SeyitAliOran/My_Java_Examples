package dersler.gun46_Review.Galeri;

import java.util.ArrayList;

public class Galeri {
    private static String name;
    private static String adres;
    private static ArrayList<Araba> arabalar = new ArrayList<>();

    static {
        // Database connection and retrieve data from database
        // File reading and assigning data to relevant properties of Class
        Galeri.setName("Modern Araba Galerisi");
        Galeri.setAdres("Siemens strasse Berlin");
        Araba araba = new Araba("Toyota","Corolla","Q123123","H-1234-De");
        addAraba(araba);

        addAraba(new Araba("Toyota","Corolla","Q123123","H-1234-De"));
        addAraba(new Araba("Mercedes","A","a12312","H-1234-De"));
        addAraba(new Araba("Ford","Focus","g1123","H-1234-De"));
        addAraba(new Araba("Nissan","Tiida","b13123","H-1234-De"));
        addAraba(new Araba("Volkswogen","Polo","s123123","H-1234-De"));
        addAraba(new Araba("TOGG","togg","e123123","H-1234-De"));

    }
    private Galeri(){
    }


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Galeri.name = name;
    }

    public static String getAdres() {
        return adres;
    }

    public static void setAdres(String adres) {
        Galeri.adres = adres;
    }

    public static ArrayList<Araba> getArabalar() {
        return arabalar;
    }
    public static void addAraba(Araba araba){
        arabalar.add(araba);
        //System.out.println(araba.getName() + " - " + araba.getModel() + " Marka/Model arac galeriye eklendi" );
    }
    public static void listByName(String name){
        int counter = 0;
        for (Araba araba:arabalar){
            if (araba.getName().equalsIgnoreCase(name)){
                counter++;
                System.out.println(araba);
            }
        }
        if (counter == 0){
            System.out.println("Galeride: " + name + " markali araba bulunmamaktadir");
        }else System.out.println(name + " markali arabadan toplam " + counter + " adet bulunmaktadir");

    }

    public static void showArabalar(){
        System.out.println(getName());
        System.out.println(getAdres());
        System.out.println("Galerimizdeki arabalarin listesi");
        System.out.println("********************************");
        for (Araba araba : arabalar){
            System.out.println("araba = " + araba);
        }
    }
}
