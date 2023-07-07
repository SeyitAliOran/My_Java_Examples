package dersler.gun19_Methods1;

public class Task_CreditCard {
    public static void main(String[] args) {
        userEligible();
        userNotEligible();

    }
    public static void userEligible(){
        double aylikGelir = 5000;
        if (aylikGelir > 4000){
            System.out.println("Kredi karti alabilirsiniz....");
        }

    }

    public static void userNotEligible(){
        double aylikGelir = 5000;
        if (aylikGelir < 4000){
            System.out.println("Kredi karti alamazsiniz....");
        }
    }
}
