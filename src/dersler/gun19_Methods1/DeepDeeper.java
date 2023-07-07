package dersler.gun19_Methods1;

public class DeepDeeper {

    public static void main(String[] args) {
        System.out.println("Main Method");
        deep();
        System.out.println("Back to Main Method");
        deeper();
        System.out.println("Back to Main Method from Deeper");
    }

    public static void deep(){

        System.out.println("Deep Method");
        deeper();
        System.out.println("Back to Deep Method");
    }

    public static void deeper(){

        System.out.println("Deeper Method");
        // deep(); error - recursive method call ---> (sonsuz dongu olur ve hata verir)
    }
}
