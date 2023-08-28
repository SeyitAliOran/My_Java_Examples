package dersler.gun50_Review.AccessModifier;

public class AccessModifier {
    // Public Variable
    public int publicVar=1;

    //Protected variable
    protected int protectedVar = 2;

    //Default variable
    int defaultVar= 3;

    //Private variable
    private int privateVar = 4;

    //public method --> Heryerden erisim saglanabilir
    public void publicMethod(){
        System.out.println("Public Method");
    }
    //protected method -->Package disindn sadece child classlar ulasabilir.
    protected  void protectedMethod(){
        System.out.println("Protected Method");
    }
    //default method --> Package disindan ulasilamaz
    void defaultMethod(){
        System.out.println("Default Method");
    }
    //private method --> Package disindan ulasilamaz sadece class
    private void privateMethod(){
        System.out.println("Private Method");
    }

}
