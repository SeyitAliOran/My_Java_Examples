package dersler.gun06_aritmeic_unaryOperators;

public class HomeWork_06 {
    public static void main(String[] args) {
        // sum num1, num2
        System.out.println("sum num1, num2");
        int num1 = 75;
        int num2 = 48;
        int sum = num1 + num2;
        System.out.println("Num1 :" + num1);
        System.out.println("Num2 :" + num2);
        System.out.println("sum = num1 + num2");
        System.out.println("Sum :" + sum);
        System.out.println("  ");

        //Convert Fahrenheit to Celcius;
        System.out.println("Convert fahrenheit to celcius");

        double celcius = 70.2;
        double fahrenheit = celcius*9/5+32;
        System.out.println( celcius + " Celcius equal to "+ fahrenheit + " fahrenheit ");

        System.out.println("  ");


        // Convert mile to km
        System.out.println("Convert mile to km");
        double oneMile  = 1.609344;
        double x = 85.0;
        double result = x * oneMile;
        System.out.println("oneMile = " + oneMile);
        System.out.println("x = " + x + "mile");
        System.out.println("Result = " + result);

        System.out.println("  ");
        // the area and perimeter of a circle that has a radius of 5.5:
        // perimeter = 2*radius*pi   area = radius * radius * pi;
        System.out.println("Calculate the area and perimeter");
        double pi = 3.14159;
        System.out.println("pi = " + pi);
        double radius = 5.5;
        System.out.println("radius = " + radius);
        System.out.println(" ");

        double perimeter = 2 * radius * pi;
        System.out.println("perimeter = 2 * radius * pi;");
        System.out.println("perimeter = " + perimeter);
        System.out.println(" ");

        double area = radius * radius * pi;
        System.out.println("area = radius * radius * pi");
        System.out.println("area = " + area);
        System.out.println(" ");

        // average of 3 numbers
        System.out.println("average of 3 numbers");
        int num3 = 3;
        int num4 = 3;
        int num5 = 3;
        int average = (num3+num4+num5)/3;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("average = (num3+num4+num5)/3 ");
        System.out.println("average = " + average);


    }
}
