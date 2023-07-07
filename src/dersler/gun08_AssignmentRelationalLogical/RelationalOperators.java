package dersler.gun08_AssignmentRelationalLogical;

public class RelationalOperators {
    public static void main(String[] args) {

        System.out.println("Relational Operators in Java.");
        // Declaration und assignment ayni satirda deger atama
        int num1 = 125, num2 = 45;
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2 + "\n");

        System.out.println("\"num1 == num2 ?\" " + (num1==num2) + "\n");
        //boolean esitmi = num1 == num2;

        boolean result = false;
        result = num1 == num2;
        System.out.println("\"num1 == num2 ?\" - Result of Comporison---> " + result + "\n");

        result = num1 > num2;
        System.out.println("\"num1 > num2 ?\" - Result of Comporison ---> " + result + "\n");

        result = num1 < num2;
        System.out.println("\"num1 < num2 ?\" - Result of Comporison ---> " + result + "\n");

        result = num1 >= num2;
        System.out.println("\"num1 >= num2 ?\" - Result of Comporison---> " + result + "\n");

        result = num1 <= num2;
        System.out.println("\"num1 <= num2 ?\" - Result of Comporison---> " + result + "\n");

        result = num1 != num2;
        System.out.println("\"num1 != num2 ?\" - Result of Comporison---> " + result + "\n");

    }

}
