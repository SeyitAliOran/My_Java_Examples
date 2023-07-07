package dersler.gun13_ternary_operator;

public class IfElseToTernary {
    public static void main(String[] args) {
        int number = 24;

        //If ELse

        if(number > 12){
            System.out.println("Positive Number");
        }else{
            System.out.println("Negative Number");
        }
        System.out.println();

        // Ternary %99 bu sekilde kullaniliyor
        String result=  (number > 0) ? "Positive Number" : "Negative Number";
        System.out.println("Ternary result = " + result);
        System.out.println();

        // Ternary operator bu sekilde yazilamaz
        // (number > 0) ? System.out.println("Positive Number") : System.out.println("Negative Number");

        // Eger sonucu ekranda gostermek istiyorsak bu sekilde yapilabilir. %1 olarak bu kullaniliyor
        System.out.println((number > 0) ? "Positive Number" : "Negative Number");

    }
}
