package dersler.gun10_ControlFlowStatement;

public class IfStatements {

    public static void main(String[] args) {

        System.out.println("Code buradan basladi");

        if (false) {
            System.out.println("Hello");
        }

        System.out.println("World");

        System.out.println("Code burada bitti");

        // If statement blogu icerisinde eger birden fazla statement var ise
        // parantez olmadan if statement kullanmak logic acisindan yanlis sonuc digurabilir
        // 2. statementin false durumunda dahi okunmasi durumu

        /*
        // boolean expression etrafindaki parantezin kaldirilmasi syntax hatasina sebep olur
        if false {
            System.out.println("Hello");
        }
         */

        int i = 5;

        if (i > 0){
            System.out.println(i + " sayisi pozitif bir sayidir");
        }
    }
}