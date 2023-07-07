package dersler.gun24_Memory_Garbage_Collection;

public class StackOverFlow {


    public static void main(String[] args) {
        System.out.println("Example of Stack Over FLow Hatasi");
        recursiveMethod2(1);
    }
    public static void recursiveMethod(int sayi){
        //System.out.println(sayi + " degeri ile Recursive method called");
        System.out.println("sayi = " + sayi);
        recursiveMethod2(sayi+1);
    }
    public static void recursiveMethod2(int sayi){
        if (sayi > 100){
            return;
        }
        System.out.println("sayi = " + sayi);
        recursiveMethod2(sayi+1);
    }
}
