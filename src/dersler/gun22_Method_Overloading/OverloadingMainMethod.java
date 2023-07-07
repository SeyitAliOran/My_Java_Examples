package dersler.gun22_Method_Overloading;

public class OverloadingMainMethod {
    // Main Method also can be overloaded
    public static void main(String[] args) {
        System.out.println("Hello from main method");
        main("Hello");
    }

    public static void main(String str) {
        System.out.println("Hello from second main method");
        main("Hello", "World");
    }

    public static void main(String str1, String str2) {
        System.out.println("Hello from third main method");
    }

}
