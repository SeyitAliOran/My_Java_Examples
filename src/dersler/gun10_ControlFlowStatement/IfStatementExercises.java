package dersler.gun10_ControlFlowStatement;

public class IfStatementExercises {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        //Which of the following if statement headers uses the correct syntax.
        // if (x equals 42){...} -  hata

        // if x = 10 then {...} - hata
        //  if (x==y) {...} - dogr
        // if (x=>y) {...} - hata
        //  if[x ==10] {...} - hata

        // Write an if statement that multiplies salary by 1.5 if hours is greather than 38

        double salary = 5000;
        int hours = 39;
        if (hours > 38){
            salary *= 1.5;
        }
        System.out.println(" Toplam odenen maas =" + salary);

        // Write an if statement that assigns 1 to x if y is greather  than 0
        // y, 0'dan büyükse x'e 1 atayan bir if deyimi yazın
        int xx = 0;
        int yy = 1;
        if (yy > 0){
            xx = 1;
        }
        System.out.println("xx = " + xx);


        // Write an if statement that increases pay by 3% if score is greater than 90
        // Eger score 90 dan buyuk ise odemeyo %3 artiran bir if statement yaziniz.
        int score = 100;
        int pay = 1000;
        if (score > 90) {
            pay += pay * 0.3;
        }
        System.out.println("score = " + pay);


        //


    }
}
