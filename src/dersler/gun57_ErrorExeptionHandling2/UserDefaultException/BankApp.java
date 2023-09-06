package dersler.gun57_ErrorExeptionHandling2.UserDefaultException;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        try{
            bankAccount.withDraw(1500);
        }catch (InsufficientBalanceException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
