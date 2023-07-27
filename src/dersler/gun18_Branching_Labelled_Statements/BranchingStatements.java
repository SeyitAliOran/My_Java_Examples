package dersler.gun18_Branching_Labelled_Statements;

public class BranchingStatements {
    public static void main(String[] args) {
        int number = 0;

        while(number < 15){
            number++;

            if(number <=5){
                System.out.println(number + " is skipped");
                continue;
            }
            System.out.println("number = " + number);

            if(number>=10){
                System.out.println(number + " is broken");
                break;
            }
        }
    }
}
