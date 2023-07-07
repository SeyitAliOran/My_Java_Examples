package dersler.gun19_Methods1;

public class MethodWithLoop {

    public static void main(String[] args) {

        System.out.println("Main Method icerisindeyim - line 7");

        for (int i = 0; i < 5 ; i++) {
            displayMessage();
            System.out.println("Dongu icerisindeyim - line 11");
            System.out.println("-----------------------------");
        }
    }
    public static void displayMessage (){
        System.out.println("Method icerisindeyim - line - 16 ");
    }
}
