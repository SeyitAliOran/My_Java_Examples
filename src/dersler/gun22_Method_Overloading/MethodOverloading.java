package dersler.gun22_Method_Overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        int result = sum(5, 3);

        //1. Method Overloading by changing the number of arguments.
        int result2 = sum(4, 5, 6);
        int result3 = sum(3, 4, 5, 6);

        // 2. Method Overloading by changing the data type.
        double result4 = sum(4.3, 3.5);

        // 3. Method overloading by changing the sequence of arguments.
        int result5 = sum(3, 4.5);
        int result6 = sum(4.5, 4);
        System.out.println("2 sayinin toplami = " + result);
        System.out.println("3 sayinin toplami = " + result2);
        System.out.println("4 sayinin toplami = " + result3);
        System.out.println("2 double sayinin toplami = " + result4);
        System.out.println("1 int 1 double saiynin toplami = " + result5);
        System.out.println("1 double ve 1 int sayinin toplami = " + result6);
    }

    // default method
    public static int sum(int a, int b) {
        return a + b;
    }

    // 1. Method Overloading by changing the number of arguments.
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 2. Method Overloading by changing the data type.
    public static double sum(double a, double b) {
        return a + b;
    }

    // 3. Method overloading by changing the sequence of arguments.
    public static int sum(int a, double b) {
        return (int) +(a + b);
    }

    public static int sum(double b, int a) {
        return (int) +(a + b);
    }
}
    // !!! Method Overloading is not POSSIBLE by changing return type
