package dersler.gun57_ErrorExeptionHandling2.ThrowKeyword;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        try{
            bankAccount.withDraw(1500);
        }catch (RuntimeException e){ // proejenin cagirildigi yerde Exception verecehi icin burada catch edilir.
            System.out.println("Error: " + e.getMessage());
        }
    }
}
