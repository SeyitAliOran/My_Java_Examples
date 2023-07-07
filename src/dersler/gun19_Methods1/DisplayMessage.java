package dersler.gun19_Methods1;

public class DisplayMessage {
    public static void main(String[] args) {

        //Declare edilen method ayni islemin tekrarinda defaatle kullanilabilir
        // Klavyeden strg kullanimi ile tiklayip direkt methodun oldugu satira gidebiliriz...
        System.out.println("Babam geldi!");
        displayMessage();
        System.out.println("Annem geldi!");
        displayMessage();
        System.out.println("Amcam geldi!");
        displayMessage();
        System.out.println("Dayim geldi!");
        displayMessage();
    }

    public static void displayMessage(){
        System.out.println("Hi");
    }
}
