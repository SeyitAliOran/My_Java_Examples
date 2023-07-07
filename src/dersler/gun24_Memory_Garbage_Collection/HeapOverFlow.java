package dersler.gun24_Memory_Garbage_Collection;

public class HeapOverFlow {
    public static void main(String[] args) {
        System.out.println("Example - Heap over Flow");
        String str = "Merhaba";
        int counter = 0;
        /*while (true){
            System.out.println("counter = " + counter++);
            str += str;
            System.out.println("str.length() = " + str.length());
            System.out.println("System.identityHashCode() = " + System.identityHashCode(str));
        }*/
        while(true){
            System.out.println("counter++ = " + counter++);
            String str1 = new String("Merhaba");
            System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));
        }
    }
}
