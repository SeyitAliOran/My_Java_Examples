package dersler.gun39_Encapsulation_1.PersonAddress;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;

    private Adres evAdresi; //instance of Adres class--- Person(class) has Adres(class)
    private Adres isAdresi; //instance of Adres class--- Person(class) has Adres(class)
    private ArrayList<Adres> adresler; //List of Adres class instances--- Person has adresler
    private int counter;

    public Person(String name, int age, Adres evAdresi, Adres isAdresi) {
        //this.name = name;
        setName(name);
        //this.age = age;
        setAge(age);
        //this.evAdresi = evAdresi;
        setEvAdresi(evAdresi);
        //this.isAdresi = isAdresi;
        setIsAdresi(isAdresi);
        this.adresler = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 2)
            this.name = name.trim().toUpperCase();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age <=100)
            this.age = age;
    }

    public Adres getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(Adres evAdresi) {
        this.evAdresi = evAdresi;
    }

    public Adres getIsAdresi() {
        return isAdresi;
    }

    public void setIsAdresi(Adres isAdresi) {
        this.isAdresi = isAdresi;
    }

    public void addAdres(Adres adres){
        if(counter < 10) this.adresler.add(adres);
        counter++;
    }
    public ArrayList<Adres> getAdresler(){
        return this.adresler;
    }
    public String toString(){
        String str = "";
        str += "Adı : " + this.name + "\n";
        str += "Yaşı: " + this.age + "\n";
        str += "Ev adresi : " + this.evAdresi.getCadde() + " caddesi" + " no = " + this.getEvAdresi().getNumber() + "-" + this.evAdresi.getSehir()  + "\n";
        str += "İş adresi : " + this.isAdresi + "\n"; //Adres class ının .toString() metodu

        str += "Diğer Adresleri : \n"; //adresler ArrayList ini dolaşıyoruz.
        for (Adres adres:this.getAdresler()){
            str += adres + "\n";
        }
        return str;
    }
}
