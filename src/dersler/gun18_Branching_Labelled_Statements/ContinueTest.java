package dersler.gun18_Branching_Labelled_Statements;

public class ContinueTest {
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;

        while(number<20){
            number++;

            if ( number == 10 || number == 11){
                continue;
            }
            sum += number;// continue sum i isleme almadan dongunun basina donuyor...
        }
        System.out.println("Sum = " + sum);
    }
}
