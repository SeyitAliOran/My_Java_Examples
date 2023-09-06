package dersler.gun57_ErrorExeptionHandling2.UserDefaultException.email;

public class EmailSenderApp {
    public static void main(String[] args) {
        EmailSender sender = new EmailSender();
        try {
            sender.sendEmail("alioran05@gmail.com","Hallo my Friend");
        } catch (EmailSendingException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
