package dersler.gun56_ErrorExeptionHandling.Errors;

public class StackOverFlowError {
    static long counter =0;
    public static void main(String[] args) {

            birMethod();

    }

    public static void birMethod(){
       counter ++;
        System.out.println(counter + " Method invoked.");
        birMethod(); // StackOverFlowError --> sonsuz döngüden dolayi hata verir
    }
}
