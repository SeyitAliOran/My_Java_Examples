package dersler.gun56_ErrorExeptionHandling1.ThrowKeyword;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void withDraw(double amount){

        if (amount > balance){ // Burada throw edilir firlatilir.
            throw new RuntimeException("Insufficient balance. Your balance is: " + balance);
        }else {
            balance -=amount;
            System.out.println("Withdraw of " + amount + "TL is successfully. Your new balance is: " +balance);
        }
    }
}
