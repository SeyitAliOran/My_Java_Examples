package dersler.gun22_Method_Overloading;

public class ProductPricing {
    public static void main(String[] args) {

        // Sabit indirim, kampanyali indirim ve vergili fiyatlari hesaplayan bir program yaziniz
        // 1. Sabit indirim uygulanmis fiyat
        // 2. Kampanyali indirim orani uygulanmis fiyat
        // 3. Kampanyali indirim ve vergi orani uygulanmis fiyat

        double price = 90.0;
        double discount = 0.20;
        double tax = 0.05;

        double finalPrice1 = calculatePrice(price);
        System.out.println("Final Price with baseDiscount : " + finalPrice1);

        double finalPrice2 = calculatePrice(price, discount);
        System.out.println("Final Price with discount : " + finalPrice2);

        double finalPrice3 = calculatePrice(price, discount,tax);
        System.out.println("Final Price with discount and tax : " + finalPrice3);
    }

    public static double calculatePrice(double price){
        double baseDiscount = 0.10;
        double discountedPrice = price - (price * baseDiscount);
        return discountedPrice;
    }

    public static double calculatePrice(double price, double discount){
        double discountedPrice = price - (price * discount);
        return discountedPrice;
    }

    public static double calculatePrice(double price, double discount, double tax){
        double discountedPrice = price - (price * discount);
        double finalPrice = discountedPrice + (discountedPrice * tax);
        return finalPrice;
    }
}
