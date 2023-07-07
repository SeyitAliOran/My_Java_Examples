package dersler.gun15_ForLoop2;

public class ForLoopContinue {
    public static void main(String[] args) {
        //Cift sayilari atla tek sayilari yazdir...
        for (int i = 1; i <= 100 ; i++) {
            if(i %2==0){
                continue;
            }
            System.out.print(i);
        }

        //son rakami 5 olan sayilari atla...Yazdirma.
        for (int i = 1; i <= 100 ; i++) {
            if(i %10 == 5){
                continue;
            }
            System.out.println("i = " + i);
        }

    }
}
