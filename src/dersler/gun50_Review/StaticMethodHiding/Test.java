package dersler.gun50_Review.StaticMethodHiding;

public class Test {
    public static void main(String[] args) {
        Sub sub = new Sub();
        // Static method:
        // Inheritance iliskisi olsa dahi static kullandigimizdan overriding olusmadi ve
        // sonuc olarak super classindaki question methodu cagirildi.

        sub.getSuperDescription();

        // Eger methodlar static olmasaydi: Inheritance iliskisi ile
        // overriding edildigi icin subClass da ki deger ekranda gosterilir.

    }
}
