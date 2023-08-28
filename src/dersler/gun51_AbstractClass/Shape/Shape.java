package dersler.gun51_AbstractClass.Shape;

public abstract class Shape {
   // Generalisation - genelleme amacli kullanilir.
    // These are  abstract methods. All children classes have to implement.
    // Butun alt class lar Abstract class larin icinde olusturulan abstract methodlari implement etmek zorundadir.
    // Abstract class larin icinde normal methodlar olusturulabilir ve bu methodlar child classlarda implement edilmek zorunda degildir
    // Abstact olmayan classlarin icinde abstract methodlar olusturamayiz
    // Child class ozelinde kullanilacak instance degisken ve ya methodlar parent classinda olusturulmasina gerek yok


    protected static final double PI = 3.14; // Eger tek bir kopyasi yeterli ise STATIC kullaniyoruz
    protected abstract double calculateArea(); // protected yazmak zorunda degiliz. Sadece miras iliskisini belirtmek icin yzdik
    protected abstract void draw();

    // Normal Method
    // This is a non-abstract method. It is non-mandatory to be implemented in children classes(Alt sınıflarda uygulanması zorunlu değildir)
    // It may be overridden or not.(Override edilebilirler)
    protected void showInfo(){
        System.out.println("I am an abstract class");
    }
    public static void merhaba(){ // Static olarak da kullanilabilir. Static override edilemez
        System.out.println("Merhaba from abstract class");
    }
}
