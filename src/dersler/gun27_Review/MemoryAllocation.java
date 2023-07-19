package dersler.gun27_Review;

public class MemoryAllocation {
    public static void main(String[] args) {

    }

    public static void method1(){
        int x = 10;
        method2(5);
    }

    public static void method2(int b){
        boolean c;
        method3();
    }

    public static void method3(){
        Bank reference = new Bank();
        reference.a = 15;
    }
    static class Bank {
        int a;
        int b;
    }
}
