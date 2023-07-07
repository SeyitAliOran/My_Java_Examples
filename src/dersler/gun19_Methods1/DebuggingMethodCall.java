package dersler.gun19_Methods1;

public class DebuggingMethodCall {
    public static void main(String[] args) {
        System.out.println("Main method icerisinde - line 5");
        method();
        System.out.println("Main method icerisinde - line 7");
        method();
        System.out.println("Main method icerisinde - line 9");
        method();
        System.out.println("Main method icerisinde - line 11");
        method();

    }

    public static void method(){

        System.out.println("Method icerisinde - line 18");
        System.out.println("Method icerisinde - line 19");

    }
}
