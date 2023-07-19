package dersler.gun31_Arrays2;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Elma";
        product1.amount = 3;
        product1.price = 185;

        Product product2 = new Product();
        product2.name = "Peynir";
        product2.amount = 3;
        product2.price = 15;

        Product[] sepetim = new Product[2];
        sepetim[0] = product1;
        sepetim[1] = product2;
        for (Product urun : sepetim){
            urun.showInfo();
            System.out.println("Urunun fiyati= "+urun.fiyatHesapla());
            System.out.println();
        }


    }
}
