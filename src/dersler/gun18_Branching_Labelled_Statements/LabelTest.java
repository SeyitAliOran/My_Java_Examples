package dersler.gun18_Branching_Labelled_Statements;

public class LabelTest {
    public static void main(String[] args) {
        int i=0;

        outer:
        do{
            i = 8;
            inner:
            while (true){
                System.out.println(i--);
                if(i ==4){
                    break outer; //outer kullanarak tum donguden cikar ve i=8 e gider. inner yazarsak while true ya gider
                }
            }
        }while(true);
    }
}
