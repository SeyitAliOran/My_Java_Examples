package dersler.gun23_Class_Object;

public class DogObject {
    public static void main(String[] args) {

        // ClassName objectName = Keyword  ClassName/Constructor
        Dog dog  = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog.ad   = "Artis";
        dog.cins = "Av köpegi";
        dog.renk = "Siyah";
        dog.yas  = 5;

        System.out.println("dog ad = " + dog.ad);
        System.out.println("dog cins = " + dog.cins);
        System.out.println("dog renk = " + dog.renk);
        System.out.println("dog yas = " + dog.yas);
        System.out.println();
        dog.isir();
        dog.havla();
        dog.yemekYe();
        dog.uyur();

        dog.cins = "Bull dog"; // en son assign edilen degeri aliyor...
        System.out.println("dog cins = " + dog.cins);
        System.out.println();
        //object uzerindenden defalarca ayni eylemi yaptirabilirim...
        dog.havla();
        dog.havla();
        dog.havla();

        System.out.println();
        //Default degerker

        System.out.println("Dog 2 "+dog2.ad);//String icin default deger "NULL" alir
        System.out.println("Dog 2 "+dog2.yas); // int icin default deger "0" olur.
        System.out.println("Dog 2 "+dog2.evcilMi); // boolean icin default deger "false" alir
        System.out.println("Dog2  "+dog2.cinsiyet); // char icin default deger "  " alir
    }
}
