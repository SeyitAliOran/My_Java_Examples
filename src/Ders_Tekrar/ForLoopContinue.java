package Ders_Tekrar;

public class ForLoopContinue {
    public static void main(String[] args) {
        for(int i = 0; i<=100; i++){
            if (i %2==0){
                continue;
            }
            System.out.print(i + " ");
        }
        for (int i = 0; i<=100; i++){
            if (i %10==0){
                continue;
            }
            System.out.println("i  = " + i);
        }
    }
}
