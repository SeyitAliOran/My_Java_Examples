package dersler.gun31_Arrays2;

import java.util.Scanner;

public class QuizProgram {
    public static void main(String[] args) {
        System.out.println("Simple quiz...");
        String question1 = "What is the capital city of Turkey?\n"+
                "(a) Kayseri\n" +
                "(b) Canakkale\n" +
                "(c) Konya \n" +
                "(d) Ankara";
        String question2 = "What is the most crowded (largest) city of Turkey?\n"+
                "(a) Amasya\n" +
                "(b) Istanbul\n" +
                "(c) Adana \n" +
                "(d) Izmir";

        Quiz[] questions = new Quiz[2];
        questions[0] = new Quiz();
        questions[0].question = question1;
        questions[0].answer = "d";

        questions[1] = new Quiz();
        questions[1].question = question2;
        questions[1].answer = "b";
        quizYap(questions);
    }

    public static void quizYap(Quiz[] questions){
        Scanner cevap = new Scanner(System.in);
        int dogruCevapSayisi = 0;
        for (Quiz soru: questions) {
            System.out.println(soru.question);
            System.out.print("Cevabiniz nedir: ");
            String cevabim = cevap.nextLine();

            if (soru.answer.equals(cevabim)){
                dogruCevapSayisi++;
            }
        }
        System.out.println();
        System.out.println("Dogru cevap sayiniz: " + dogruCevapSayisi+ "/" + questions.length);
    }

}
