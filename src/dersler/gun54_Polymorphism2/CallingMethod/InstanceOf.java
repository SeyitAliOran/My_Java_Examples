package dersler.gun54_Polymorphism2.CallingMethod;

public class InstanceOf {
    public static void main(String[] args) {
        Sekil sekil1 = new Kare();
        Sekil sekil2 = new Ucgen();
        Sekil sekil3 = new Daire();
        if (sekil1 instanceof Kare){
            System.out.println("Kare");
        }if (sekil2 instanceof Ucgen ){
            System.out.println("Ucgen");
        }if (sekil3 instanceof Daire ){
            System.out.println("Daire");
        }
    }
}
