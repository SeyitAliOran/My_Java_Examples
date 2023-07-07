package dersler.gun24_Memory_Garbage_Collection;

public class Product {
    String name;
    double unitPrice;
    double amount;

    public double fiyatHesapla(){
        /*double result = 0;
        result = unitPrice * amount;
        return result;*/
        return unitPrice * amount;
    }
    public double kdvHesapla(){
        return fiyatHesapla() * 1.18;
    }

    public void finalize(){
        System.out.println("**************************");
        System.out.println("Garbage collection calisti");
        System.out.println("**************************");

    }
}
