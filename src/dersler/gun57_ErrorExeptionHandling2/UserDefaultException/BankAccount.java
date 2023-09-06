package dersler.gun57_ErrorExeptionHandling2.UserDefaultException;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void withDraw(double amount) throws InsufficientBalanceException {

        if (amount > balance){
           throw new InsufficientBalanceException("Insufficient balance. Your balance is: " + balance);
        }else {
            balance -=amount;
            System.out.println("Withdraw of " + amount + "TL is successfully. Your new balance is: " +balance);
        }
    }
}
