package dersler.gun27_Review;

public class DogObject {
    public static void main(String[] args) {
        //Garbage collection icin obkjecti unreferenced yapmanin 2 yolu

        // 1. Yol : Objecti NULL yapmak
        Dog dog1 = new Dog();
        System.out.println("dog1 = " + dog1); //dog1 = Dog@119d7047 (Reference numarasi)

        dog1 = null;
        System.out.println("dog1 = " + dog1); //dog1 = null

        // 1. Yol : Objecti bir diger objecjte referans etmek
        Dog dog2 = new Dog();
        System.out.println("dog2 = " + dog2); // dog2  = Dog@776ec8df (Reference numarasi)


        Dog dog3 = new Dog();
        System.out.println("dog3 = " + dog3);// dog2  = Dog@4eec7777 (Reference numarasi)

        dog2 = dog3;
        System.out.println("dog2 = " + dog2);// dog2  = Dog@4eec7777 (Reference numarasi)
        System.out.println("dog3 = " + dog3);
    }

}
