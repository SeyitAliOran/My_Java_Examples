package dersler.gun56_ErrorExeptionHandling1.UserDefaultException;

public class InsufficientBalanceException extends Exception {
    // Exception classini extend ederek oradaki butun alt classlardaki exceptionlara ulasabiliyoruz.
    // bu sekilde kendimize ozel exceptionlar olusturuyoruz
    public InsufficientBalanceException(String message){
        super(message);
    }

}
