package dersler.gun18_Branching_Labelled_Statements;

public class BreakExamples {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
          if (i==3){
              System.out.println("Hazir ol! döngüden cikiyoruz");
              break;
              //System.out.println("Hello");
          }
            System.out.println("i = " + i);
            System.out.println("Blok icindeyiz");
        }
        System.out.println("Blok disindayiz");
    }
}
