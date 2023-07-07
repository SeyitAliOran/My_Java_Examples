package dersler.gun23_Class_Object;

public class Dog {
    // Template class is blueprint (Bu bir taslak sinif)
    // burada herhangi bir kodu calistirmayacagiz sadece sablon olarak kullaniyoruz...
    // burada sadece OBJECT in ozelliklerini belirliyoruz...

    // Instance Variables
    String ad;
    String cins ;
    String renk;
    int yas;
    boolean evcilMi;
    char cinsiyet;

    // Instance Methods ( Static keyword kullanilmiyor)
    public void havla(){
        System.out.println("Havliyor...");
    }

    public void isir(){
        System.out.println("Isiriyor...");
    }

    public void yemekYe(){
        System.out.println("Yemek yiyor...");
    }

    public void uyur(){
        System.out.println("Uyuyor...");
    }
}
