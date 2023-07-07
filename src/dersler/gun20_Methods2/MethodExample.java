package dersler.gun20_Methods2;

public class MethodExample {
    public static void main(String[] args) {

        System.out.println("Methods - 2 in Java");
        calculation(11);
        System.out.println();

        short shortVar = 5;
        calculation(shortVar); // Widening type promotion
        System.out.println();

        double doubleVar = 1.5;
        calculation((int) doubleVar); // Casting type promotion
        System.out.println();

    }
    public static void calculation(int num){
        // num is local variable. And, it is not accessible outside the method.
        System.out.println("Variable num = " + num);
    }

}
