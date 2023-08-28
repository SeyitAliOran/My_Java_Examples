package dersler.gun50_Review.FinalKeyword;

public class FinalKeyword {
    //final variable  - constant value(degistirilemez)
     private final int FINALVAR = 1;

     //final method - no Overriding
     public final void finalMethod(){
         System.out.println("Final Method");
     }

     // final parameter - NO reassignment

     public void finalParameter(final int parameter){
         // Can not be assigned
         // parameter = 3; // Error
     }

}

// final class - stop Inheritance
  final class FinalClass{
    public void print(){
        System.out.println("Final Class");
    }
  }
  //class ChildCLass extends FinalClass{ } Parent class Final ise child class olusturulamaz
class Parent{
    public void print(){
        System.out.println("Final Method");
    }
  }

  class Child extends Parent{
    public void print(){ // Ayni isimden dolayi override edebiliyoruz . Eger parent class da ki method final olsayi override edilmezdi
        System.out.println("Child Method");
    }
  }

