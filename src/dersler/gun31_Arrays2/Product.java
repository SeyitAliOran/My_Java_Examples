package dersler.gun31_Arrays2;

import dersler.gun29_StringMethods2.StringIndexOf;

public class Product {
    // Data members --- fields---states---properties
    String name; // Urunun ismi
    double price; // Birim fiyati
    double amount; // miktar

    public void showInfo(){
        System.out.println("Name  : " + name);
        System.out.println("Price : " + price);
        System.out.println("Amount: " + amount);


    }
    public double fiyatHesapla(){
        return price*amount;

    }
    public  double toplamFiyatHesapla(Product[] sepet){
        double toplamFiyat = 0;
        for (Product urun:sepet){
            toplamFiyat += urun.fiyatHesapla();
        }
        return toplamFiyat;

    }
}

