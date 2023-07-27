package CodingBath;

public class max1020 {
    /*

Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
 or return 0 if neither is in that range.
max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
     */
    public static void main(String[] args) {
    int a = 21;
    int b = 9;
        System.out.println("max1020(a,b) = " + max1020(a, b));
    }
    public static int max1020(int a, int b){
        int newNumber = 0;
        if (a>20 || a<10) newNumber = b;
        if (b>20 || b<10) newNumber = a;
        if ((a>20 || a<10) && (b>20 || b<10) ) newNumber = 0;
        if (a>b && a>=10 && a<=20){
            newNumber= a;
        }
        if (b>a && b>=10 && b<=20) {
            newNumber = b;
        }

        return newNumber;
    }

}
