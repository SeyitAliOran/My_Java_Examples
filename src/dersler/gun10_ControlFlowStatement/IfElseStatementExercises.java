package dersler.gun10_ControlFlowStatement;

public class IfElseStatementExercises {
    public static void main(String[] args) {
        System.out.println();
        // Eger kisinin yasi 18 e esit ve buyukse oy kullanabilir yoksa kullanamaz yazsin....

        int age = 18;
        if (age >=18){
            System.out.println("Kisi oy kullanabilir...\n");
        }else{
            System.out.println("Kisi 18 Yasindan kucuk oldugu icin oy kullanamaz...\n");
        }

        // Write a program that calculates the area of a circle

        int radius = 15;
        double pi = 3.14;
        double area;

        if (radius > 0){
            area = radius * radius * pi;
            System.out.println("Area  = " + area);
            System.out.println();
        }else {
            System.out.println("This is not a circle\n");
        }

        //Write a Java program that prints whether number is positive or negative

        int number = -5;
        if (number >=0) {
            System.out.println(number + " is a positive number\n");

        }else {
            System.out.println(number + " is a negative number\n");
        }


        // tek ve ya cift olup omadigini yazan program

        int number4 = 11;
        if (number4 % 2 == 0){
            System.out.println(number4 + " cift bir sayidir \n");

        }else{
            System.out.println(number4 + " tek bir sayidir\n ");
        }

        // score 90 dan buyukse %3 artir diger halde %1 artir
        int score = 80;
        double pay = 1000;
        if (score > 90) {
            pay += (pay * 3 / 100);
            System.out.println("score = " + pay);
        }else {
            pay += (pay / 100);
            System.out.println("score = " + pay);
        }


        // Write an if statement that checks the multiple conditions using logical operators for a student
        //bir ogrencinin ogrenci indirimi alabilmesi icin
        // age>=18 , age<=30,
        // kisinin ogrenci olup olmadigi true mu flase mu

        int age1 = 27;
        boolean isStudent = true;

        if  (age1 >=18 && age1<=30 && isStudent) {
            System.out.println(" Ogrenci indirimi uygulandi");
        }else{
            System.out.println(" ogrenci indirimi uygulanamadi");
        }


    }
}
