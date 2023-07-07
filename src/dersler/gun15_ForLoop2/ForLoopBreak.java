package dersler.gun15_ForLoop2;

public class ForLoopBreak {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            if(i ==3){
                break; // i eger 3 esit ise donguyu durdur ve cik
            }
            System.out.println(i);
        }
    }
}
