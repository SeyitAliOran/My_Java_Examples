package dersler.gun50_Review.VariableHiding;

public class Child extends Parent {
   String name = "ChildClass"; // name hem Parent hem de Child da ayni isimle bulunuyor

    public void print(){
        System.out.println(name); // burada ki name instance'i child classindan aliyor ve parent classda ki variable gizliyor
    }
    public void printParent(){
        System.out.println(super.name); // bu sekilde parent classinda ki name degerine ulasiriz
    }
}
