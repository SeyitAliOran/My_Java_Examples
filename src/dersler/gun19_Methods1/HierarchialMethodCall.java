package dersler.gun19_Methods1;

public class HierarchialMethodCall {
    public static void main(String[] args) {


        System.out.println("Main Method - line 7");
        displayMessage();
        System.out.println("Main Method - line 9");

    }

    public static void displayMessage(){ // Bir Method icerisinde baska bir methodu cagirabiliyoruz...

        System.out.println("Display Method - line 15");
        calculation();
        System.out.println("Display Method - line 17");
    }

    public static void calculation(){
        System.out.println("Calculation Method - line 21");

    }

}
