package dersler.gun13_ternary_operator;

public class HomeWorkJob {
    public static void main(String[] args){

        String name = "Ahmet Yilmaz";
        int age = 31;
        String secildiMi = "";

        secildiMi = (age > 30 && name.equals("Ahmet Yilmaz"))? "Secildiniz" : "Secilmediniz.";
        System.out.println("Merhaba " + name +" QA Mühendisi olarak "+ secildiMi);

    }
}
