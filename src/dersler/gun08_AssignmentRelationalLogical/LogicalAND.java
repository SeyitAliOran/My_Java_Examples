package dersler.gun08_AssignmentRelationalLogical;

public class LogicalAND {
    public static void main(String[] args) {
        System.out.println("Logical Operators ---> AND");
        System.out.println("--------------------------");

        int sayiA = 8;
        int sayiB = 5;

        int sayiC = 3;
        int sayiD = 7;

        /*her iki taraf TRUE ise sonuc TRUe dur.Eger biri degilse sonuc FALSE olur.
        AND
                True  True ---> True
                True  False---> False
                False True ---> False
                False False---> False
        */

        System.out.println((sayiA > sayiB) && (sayiC < sayiD));
        System.out.println("true && true --->" + (true && true));
        System.out.println();

        System.out.println((sayiA > sayiB) && (sayiC > sayiD));
        System.out.println("true && false --->" + (true && true));
        System.out.println();


        System.out.println((sayiA < sayiB) && (sayiC < sayiD));
        System.out.println("false && true --->" + (true && false));
        System.out.println();

        System.out.println((sayiA < sayiB) && (sayiC > sayiD));
        System.out.println("false && false --->" + (false && false));
        System.out.println();

        System.out.println("--------------------------");
        System.out.println("Short circuit AND(&&)");
        System.out.println("--------------------------");

        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();

        System.out.println("a < b && a++ < c - --->  " + (a < b && a++ < c)); // False && True ---> False
        System.out.println();

        System.out.println("a < b & a++ < c - --->  " + (a < b & a++ < c)); // False & True ---> True
        System.out.println("a = " + a);
        System.out.println();


    }
}
