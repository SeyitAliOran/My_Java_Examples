package dersler.gun08_AssignmentRelationalLogical;

public class LogicalOr {
    public static void main(String[] args) {
        //Logical OR(||)

        System.out.println("-------------------------");
        System.out.println("Logical OR(||).");

        int sayiA = 8;
        int sayiB = 5;
        int sayiC = 3;
        int sayiD = 7;

        /*
          OR ---> truth table
             True   True  ---> True
             True   False ---> True
             False  True  ---> True
             False  False ---> False
         */

        System.out.println((sayiA > sayiB) || (sayiC < sayiD));
        System.out.println("true || true ---> " + (true || true));
        System.out.println();

        System.out.println((sayiA > sayiB) || (sayiC > sayiD));
        System.out.println("true || false ---> " + (true || false));
        System.out.println();

        System.out.println((sayiA < sayiB) || (sayiC < sayiD));
        System.out.println("false || true ---> " + (false || true));
        System.out.println();

        System.out.println((sayiA < sayiB) || (sayiC > sayiD));
        System.out.println("false || false ---> " + (false || false));

        System.out.println();

        System.out.println("------------------------");
        System.out.println(" Short circuit OR(||)");
        System.out.println("------------------------");

        int a = 10;
        int b = 5;
        int c = 20;

        // || short circuit Conditional OR---> if first condition is true no need to check the second or others expressions
        // ilk karşılaştırma true ise || sağındaki daha sonraki karşılaştırmaları yapmaya gerek duymaz.
        System.out.println("a > b || a++ < c ---> " + (a > b || a++ < c)); // true
        System.out.println("a = " + a); // a = 10 - first condition is true therefore second is not checked

        System.out.println();
        // | Logical OR---> the operator always evaluates both expressions.
        System.out.println("a > b | a++ < c ---> " + (a > b | a++ < c)); //true
        System.out.println("a = " + a); // a = 11 because second condition is evaluates and a = 11
    }
}
