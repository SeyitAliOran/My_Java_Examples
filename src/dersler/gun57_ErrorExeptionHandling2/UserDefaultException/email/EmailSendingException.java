package dersler.gun57_ErrorExeptionHandling2.UserDefaultException.email;

public class EmailSendingException extends Exception{
   public EmailSendingException(String message){
       super(message);
   }
}
