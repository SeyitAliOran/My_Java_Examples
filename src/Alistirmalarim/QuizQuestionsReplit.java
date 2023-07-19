package Alistirmalarim;

import java.util.Scanner;

public class QuizQuestionsReplit {
    public static void main(String[] args) {
        String question = "what is the farthest planet in the solar system:\n" +
                "a)venus\n" +
                "b)pluto\n" +
                "c)neptune";
        Scanner sc = new Scanner(System.in);
        System.out.println("Your answer");
        String answer = sc.nextLine();

        switch (answer){
            case "a":
                System.out.println("a is wrong");
                break;
            case "b":
                System.out.println("b is correct");
                break;
            case "c":
                System.out.println("c is wrong");
                break;
            default:
                System.out.println(answer + " is not valid");
        }
    }
}
