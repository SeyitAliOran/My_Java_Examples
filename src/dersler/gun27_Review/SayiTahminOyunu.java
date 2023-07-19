package dersler.gun27_Review;

import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {

        // Kullanicidan 1 ile 30 arasindaki gizli sayiyi tahmin edebilecegi bir program yaziniz.
        // Tahmin dogru ise bunu belirten yanls ise, kucuk mu buyuk mu tahmin yapmasi gerektigini soyleyerek yonlendiren
        // Ayrica kullanicinin kacinci tahminde gizli sayiya ulastigini belirten bir program olsun

        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen 1 ile 30 arasinda bir rakam tahmin ediniz :");
        int input;
        int gizliSayi = 11;
        int sayac = 0;

        do{
            input = sc.nextInt();

            if(input < gizliSayi){
                System.out.println("Daha buyuk bir sayi giriniz!");
            }else if(input > gizliSayi){
                System.out.println("Daha kucuk bir sayi giriniz");
            }else{
                System.out.println("Tebrikler, gizli sayiyi buldunuz!!!");
            }

            sayac++;

        }while(input != gizliSayi);

        System.out.println("Sayiyi " + sayac + " nci denemede buldunuz");

    }
}
