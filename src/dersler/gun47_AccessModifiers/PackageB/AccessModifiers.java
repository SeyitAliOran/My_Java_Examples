package dersler.gun47_AccessModifiers.PackageB;

public class AccessModifiers {
    public static void main(String[] args) {
        System.out.println("Access modifiers in Java");

        // Ayni class in icerisindeki tum  ogelere access mofiers ne olursa olsun erisebiliriz
        AccessModifiers accessModifiersObj = new AccessModifiers();
        AccessModifiers obj = new AccessModifiers();
        obj.id = 10;
        obj.name = "Ahmet";
        obj.okulNo = 123;
        obj.TCNO = 12341414;
        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();
        obj.toplam(10,20);

    }
    private int id;
    protected int TCNO;
    public String name;
    int okulNo;

    private void toplam(int sayiA, int sayiB){
        System.out.println("I am a private method.");
        System.out.println("Toplam = " + (sayiA+sayiB));
    }
    void defaultMethod(){
        System.out.println("I am a default method");
    }
    protected void protectedMethod(){
        System.out.println("I am a protected method");
    }
    public void publicMethod(){
        System.out.println("I am a public method");
    }
}
