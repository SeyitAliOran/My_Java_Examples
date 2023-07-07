package dersler.gun16_WhileDoWhileLoops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 0;
        //loopa girdikten sonra loop un devam etmeyecegine sonradan karar verceksek DO WHILE
        do{
            // Loop body
            System.out.println("Do While Loop blogunun icerisindeyim.");
            System.out.println("Hello Java");
            counter++;
        }while (counter <5);

        System.out.println("----------------------------------------");
        //loop un devam etmeyecegine onceden karar verceksek WHILE
        counter = 0;
        while (counter < 5){
            System.out.println("While Loop blogunun icerisindeyim.");
            System.out.println("Hello Java");
            counter++;
        }
    }
}
