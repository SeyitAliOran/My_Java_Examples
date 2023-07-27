package dersler.gun06_aritmeic_unaryOperators;

public class ArithmethicOperetors {
    public static void main(String[] args) {

        int addition,substraction, division, multiplication, modulo;
        int num1 = 10;
        int num2 = 3;

        addition = num1 + num2;
        System.out.println("Addition :"  + addition );

        substraction = num1 - num2;
        System.out.println("Substraction = " + substraction);

        division = num1 / num2;
        System.out.println("Division = " + division);

        multiplication = num1 * num2;
        System.out.println("Multipication = " + multiplication);

        modulo = num1 % num2;
        System.out.println("Modulo = " + modulo); // Modulo ile bolme isleminden kalan sonuc bulunur

        //System.out.println(10/0); Java da 0 a  bolme isleminde hata veriyor.

        System.out.println("O a bolme :" + 0/10);
        System.out.println("O ile carpma :" + 10*0);

        double num3 = 10;
        double num4 = 3;
        System.out.println("Sonuc :" + num3/num4);

        int calculation = 18+9/3; // Matematikte oldugu gibi javada da oncelik bolme ve carpma gelir
        System.out.println("Calculation :" + calculation);


    }
}
