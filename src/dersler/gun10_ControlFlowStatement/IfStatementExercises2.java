package dersler.gun10_ControlFlowStatement;

public class IfStatementExercises2 {
    public static void main(String[] args) {
        //  eger sayi 5 in katlari ise "HI FIVE" yaz
        // eger sayi 2 ye tam bolunuyor ise "HI EVEN" yaz
        int sayi = 20;
        if (sayi%5 == 0){
            System.out.println("Hi Five");

        }
        if (sayi%2 == 0){
            System.out.println("Hi Even");
        }
        System.out.println();

        // Eger kisinin yasi 18 e esit ve buyukse oy kullanabilir yoksa ekrana bir sey yazdirma...

        int age = 19;
        if (age >=18){
            System.out.println("Kisi oy kullanabilir...\n");
        }
        // verilen 3 tane sayi icerisinde en buyuugunu bulani yaz

        int number1 = 20;
        int number2 = 35;
        int number3 = 15;

        if (number1 > number2 && number1 > number3){
            System.out.println(number1 + " is the greatest number");
        }


        if (number2 > number1 && number2 > number1){
            System.out.println(number2 + " is the greatest number");
        }


        if (number3 > number2 && number3 > number1){
            System.out.println(number3 + " is the greatest number");
        }
    }
}
