package dersler.gun38_Constructors_PassingObjects2;

public class Apple {
    // Ayni class icinde objecti metod icerisinde kullanmayi ogreniyoruz.
    String color = "red";
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println("apple.color = " + apple.color);
        changeAppleColor(apple); // apple objcetini atadik
        System.out.println("apple.color = " + apple.color);
    }

    public static void changeAppleColor(Apple a){ // objcetin class ismini parametre olarak gonderdik
        a.color = "green";

    }
}
