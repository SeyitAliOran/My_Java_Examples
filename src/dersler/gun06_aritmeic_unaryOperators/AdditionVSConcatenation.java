package dersler.gun06_aritmeic_unaryOperators;

public class AdditionVSConcatenation {
    public static void main(String[] args) {
        //(+) nin farkli kullanim sekilleri
        // NUMBER + NUMBER = Addition Operator
        System.out.println(10+3);

        // Number + String = Concatenation
        System.out.println(10+ "yasinda");


        //String  + booelan = Concatenation
        System.out.println("Isminiz"+ false);

        //String + String = Concatenation
        System.out.println("Hello " + "World");

        //Boolean + Number = Error
        // System.out.println(true+10); hata verir
    }
}
