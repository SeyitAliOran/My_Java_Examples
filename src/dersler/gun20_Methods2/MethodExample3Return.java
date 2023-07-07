package dersler.gun20_Methods2;

public class MethodExample3Return {
    public static void main(String[] args) {

        int sonuc = hesapla(23,7); // hesapla methodunu sonuc cagiriyor...

        System.out.println("sonuc = " + sonuc); // burada da ekrana yazdiriyor...
        System.out.println(hesapla(2,6)); // hesapla methodunu println cagiriyor ve ekrana yazdiriyor...


    }
    public static int hesapla(int sayi1, int sayi2){
        int result = 0;
        result  = sayi1 + sayi2;
        return result;
    }
}
