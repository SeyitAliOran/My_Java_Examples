package dersler.gun13_ternary_operator;

public class OddEvenTernary {
    public static void main(String[] args) {
        int x = -2;
        String oddEven;
        if (x %2 == 0){
              oddEven = "Even Number";
        }else oddEven = "Odd Number";

        System.out.println("oddEven = " + oddEven);


        //Ternary
        if(x >= 0){
            oddEven = (x %2 == 0) ? "Even Number" : "Odd Number";
        }else {
            oddEven= "Not positive number";
        }
        System.out.println("oddEven = " + oddEven);

        // Once sayinin positive olup olmadigini check ederek tek-cift karsilastirmasi yapalim

    }
}
