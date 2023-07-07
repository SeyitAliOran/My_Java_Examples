package dersler.gun15_ForLoop2;

public class ForLoopBreak1 {
    public static void main(String[] args) {
        int rastgeleSayi = 1+ (int) (Math.random()*100);


        for (int i = 0; i < 100; i++) {
            if(rastgeleSayi == i){
                System.out.println("Rastgele sayisini buldum.");
                System.out.println("Rastgele sayi : " + rastgeleSayi);
                System.out.println("Döngünün i degeri : " + i);
                break;
            }
        }
    }

}
