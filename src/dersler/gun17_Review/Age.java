package dersler.gun17_Review;

public class Age {
    public static void main(String[] args) {
        // Write a program that accepts an age and defines the type of the person
        // Verilen yas araligina gore kisinin turunu belirten bir program yaziniz
        // 0 -2 yas ==> Bebek
        // 2 - 13 yas ==> Cocuk
        // 13 - 18 yas ==> Genc
        // 19 - 50 yas ==> Yetiskin
        // 50 ve uzeri ==> Yasli
        int age  = 3;
        String personType ="";
        if (age >= 0 && age <=2 ){
           personType =" bebek";
        }else if(age >=3 && age <=13){
            personType =" cocuk";
        }else if(age >= 14 && age <= 18){
            personType =" genc";
        }else if(age >= 19 && age <=50){
            personType =" yetiskin";
        }else if (age >50) {
            personType =" yasli";
        }
        System.out.println("Person type = " + personType);
    }
}
