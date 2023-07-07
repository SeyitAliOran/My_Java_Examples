package dersler.gun13_ternary_operator;

public class TernaryOperator {
    public static void main(String[] args) {

        int x,y;
        x = 20;

        //  Condition false dondugu icin ':' expression y execute ediliyor ve 90 degeri assign ediliyor.
        y = (x == 1) ? 61 : 90;
        System.out.println("y ist " + y);
        System.out.println();

        //  Condition true dondugu icin '?' expression y execute ediliyor ve 61 degeri assign ediliyor.
        y = (x == 20) ? 61 : 90;
        System.out.println("y ist " + y);
        System.out.println("-----------------");

        // Data turlerine dikkat ederek condition olusturmak gerekiyor.
        boolean b;

        String a = "10";

        b =  (a == "10") ? true : false;
        System.out.println("b = " + b );
        System.out.println();

        b =  (a == "11") ? true : false;
        System.out.println("b = " + b);

    }
}
