package dersler.gun57_ErrorExeptionHandling2.UserDefaultException.email;

public class EmailSender {
    public void sendEmail(String recipient, String message) throws EmailSendingException {
        boolean success = simulateEmailSending(recipient,message);
        if (!success){
            throw new EmailSendingException("Failed to send email to: " + recipient);
        }else {
            System.out.println("Email sent successfuly to: " + recipient);
        }

    }
    private boolean simulateEmailSending(String recipient, String message){
        System.out.println("Simulate sending email to: " + recipient);
        return false;
    }

}
