package dersler.gun39_Encapsulation_1.EncapsulationExample;

import dersler.gun16_WhileDoWhileLoops.SimpleArithmeticGame;

public class SimpleGetterAndSetter {
    private int number; // default access modifier --- can be accessed by classes in same PACKAGE
    private int result; // default access modifier --- can be accessed by classes in same PACKAGE
    private int number2;// private-restricted access modifier --- only class members can access

    public SimpleGetterAndSetter() {
        System.out.println("Default constructor invoked/called.");
    }

    public SimpleGetterAndSetter(int number, int result) { //Constructor'un temel amaci sadece object'e deger assign etmek
        System.out.println("Parameterized constructor invoked/called.");
       // if (number>0) this.number = number; ---->  burada degilde setter in icinde yapiyoruz
      //  if (result>0)  this.result = result; ---->  burada degilde setter in icinde yapiyoruz
        setNumber(number);
        setResult(result);

    }

    public void metod1() {
        // class member can access
        number2 = 12;
    }

    // Getter
    public int getNumber2() {
        return this.number2;
    }

    // Setter
    public void setNumber2(int deger) {
        if (deger >= 0 && deger <= 100) {
            number2 = deger;
        } else System.out.println("0-100 arasi bir tam sayi olmali");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number>0) this.number = number;
    }
    public void guncelleNumber(int number) { // setNumber ile ayni islemi yapiyor. Ismi sadece genel kurallardan dolayi kullaniyoruz
        if (number>0) this.number = number;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        if (result>0) this.result = result;
    }

}
