package dersler.gun18_Branching_Labelled_Statements;

public class LabelStatementsExample {
    public static void main(String[] args) {

        // Nested dongu icerisindeki i ve j degerlerinin carpimiyla
        // hedeflenen sayiya ulasip ulasmadigimizi tespit eden
        // ulasildiginda donguden cikan bir program yaziniz

        int targetNumber = 27;
        boolean isFound = false;

        outer:
        for(int i=1; i<=10; i++){
            inner:
            for(int j=1; j<=5; j++){
                if(i * j == targetNumber){
                    System.out.println("Target number " + targetNumber + " is found");
                    isFound = true;
                    break outer;
                }
            }
        }

        if(!isFound){
            System.out.println("Target number " + targetNumber + " is not found");
        }

    }
}
