package dersler.gun23_Class_Object;

public class Student {
    // Bir student classi olusturun ve bu class ile
    // bir ogrencinin alabilecegi ozellikleri yaz -name,-surName,-className,-schoolNumber,-age,-weight
    // bir ogrencinin yapabilecegi -study,-code,-eat,-run tanimlayan template olusturma...
    String name;
    String surName;
    String className;
    int schoolNumber;
    int age;
    double weight;

    public void study(){
        System.out.println("Studying...");
    }
    public void code(){
        System.out.println("Coding...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void run(){
        System.out.println("Running...");
    }
}
