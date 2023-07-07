package dersler.gun08_AssignmentRelationalLogical;

public class AssignmentOperators {
    public static void main(String[] args) {

        System.out.println("Assignment Relational Logical Operators\n");
        int num1;
        int num2;
        // int num1,num2; bu sekilde de atama yapilabilir.

        // "=" assignment sagdakini soldakine atamak icin  kullanilir.
        num1 = 10; // sabit olan 10 sayisina literal deniyor
        num2 = 5;

        System.out.println("\"=\" assignment operator.");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2 + "\n");

        // "+=" assignment operator
        System.out.println("\"+=\" assignment operator.");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        num1 += num2; // num1 = num1 + num2 ---> num1= 10+5;
        System.out.println("\"num1 += num2\" :" + num1);
        num1 = num1+num2;
        System.out.println("num1 = " + num1 + "\n");

        //"-=" assignment operator
        System.out.println("\"-=\" assignment operator.");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        num1 -= num2; // num1 = num1-num2;----> num1 = 20-5
        System.out.println("\"num1 -= num2\" :" + num1 + "\n");

        //"*=" assignment operator
        System.out.println("\"*=\" assignment operator.");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        num1 *=num2;// num1 = num1*num2;----> num1 = 15*5
        System.out.println("\"num1 *= num2\" :" + num1 + "\n");

        //"/=" assignment operator
        System.out.println("\"/=\" assignment operator.");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        num1 /= num2;// num1 = num1*num2;----> num1 = 75/5
        System.out.println("\"num1 /= num2\" :" + num1 + "\n");

        //"%=" assignment operator
        System.out.println("\"%=\" assignment operator.");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        num1 %= num2;
        System.out.println("\"num1 %= num2\" :" + num1); //Kalan olmadigi icin sonuc 0 olur



    }
}
