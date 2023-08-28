package dersler.gun51_AbstractClass.Vehicle;

import java.util.ArrayList;

public class Otopark {
    private String name;
    private String address;
    private final ArrayList<Arac> araclar;

    public Otopark(String name, String address) {
        this.name = name;
        this.address = address;
        this.araclar = new ArrayList<>();
    }
    public void addArac(Arac arac){
        this.araclar.add(arac);
    }
    public void aracListe(){
        System.out.println(name);
        System.out.println(address);
        System.out.println("******************************************************");
        System.out.println("Otoparkta toplam " + araclar.size() + " adet arac var.");
        System.out.println("Otoparktaki araclarin listesi.");
        System.out.println("-------------------------------------------------------");
        for (Arac arac:this.araclar){
            arac.printInfo();
            if (arac instanceof  Otobus){ // instanceof metodu ile otobus mu diye bulabiliyoruz
                System.out.println("Kapi sayisi = " + ((Otobus) arac).getDoors()); // araci otobuse cevirip kapiya ulastik yada otobus pritInfodan da yapabilirdik
            }
            System.out.println("---------------------------");
        }
    }
}
