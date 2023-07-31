package dersler.gun41_Review;

import java.util.ArrayList;

public class Galeri {
    private String name;
    private String adres;

    private ArrayList<Car> arabalar;

    public Galeri(){
        this.name= "";
        this.adres="";
        this.arabalar = new ArrayList<>(); // bos bir araba listesi olusturduk
    }
    public Galeri(String name, String adres){
        this(); // array listi eklemek icin yaptik yada direkt this.arabalar = new ArrayList<>(); yapabilirdik
        this.name = name;
        this.adres = adres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public ArrayList<Car> getArabalar() {
        return arabalar;
    }
    public ArrayList<Car> setArabalar() {
        return arabalar;
    }
    public void arabaEkle(Car araba){
        this.arabalar.add(araba); // arabalar array listine ekliyoruz

    }
    public int getArabaSayisi(){
        return arabalar.size(); // bu sekilde arraye eklenen listede ki araba sayisini gorebiliriz
    }

    public ArrayList<Car> arabaListele (String marka){ // sadece markasi ayni olanlari liste
        ArrayList<Car> result = new ArrayList<>();
        for(Car araba : arabalar){
            if (araba.getMarka().equals(marka)){
                result.add(araba);
            }
        }
        return result;
    }

    public ArrayList<Car> arabaListele(String marka, String model){ // overloading yaptik
        ArrayList<Car> result = new ArrayList<>();
        for(Car araba:arabaListele(marka)){
            if (araba.getModel().equals(model)){
                result.add(araba);
            }
        }
        return result;
    }

    public Car plakadanArabaBul(String plaka){ // plaka tek oldugu icin ARRAY kullanmadik
        Car car = new Car();
        for(Car araba : arabalar){
            if ((araba.getPlateNumber().equals(plaka))){
               car = araba;
               break;
            }
        }
        return car;
    }

    public void arabaSil(Car araba){
        this.arabalar.remove(araba);
    }
    // bu islem yeniden yazilacak
    public void arabaMarkaSil(String marka){
       arabalar.removeAll(arabaListele(marka));

    }

    public String getArabaListesi(){
        String str = "";
        for (Car araba:arabalar){
            //str += araba + "\"";
            str += araba.getMarka() + " " + araba.getModel() + "\n";
        }
        return str;
    }
    public String toString(){
        String str = "";
                str += "Galerinin adi    : " +getName() + "\n";
                str += "Galerinin adresi : " + getAdres() + "\n";
                str += "Galeride ki arabalarin listesi (" +getArabaSayisi()+") adet araba var" +"\n";
                str += getArabaListesi();
        return str;
    }

    public static void main(String[] args) {
        Galeri galeri = new Galeri("Oran Oto Galeri","Amasya Suluova");
        Car araba = new Car("Toyota","Corolla");
        Car araba2 = new Car("Toyota","Avensis");
        Car araba1 = new Car("Ford","Mondeo");

        araba1.setPlateNumber("34abc12345");
        araba2.setPlateNumber("06xyz");
        galeri.arabaEkle(araba);
        galeri.arabaEkle(araba1);
        galeri.arabaEkle(araba2);


        System.out.println(galeri);

     /*  for(Car car :galeri.arabaListele("Toyota", "Avensis")){
           System.out.println(car.getMarka());
           System.out.println(car.getModel());
       }

      */
        System.out.println(galeri.plakadanArabaBul("06xyz"));


    }
}
