package Replit;

public class ReplitSplitEmail {
    /*
     Check if the given string is an email or not by looking for @. Then spit email into id part and domain part and display the result.

  Tip:   Use String split method and arrays

  Example:

    Input:

  ``info@eurotechstudy.com``

    Output:

 ``email id: info ``

   ``email domain: eurotechstudy.com``
     */
    public static void main(String[] args) {
        String email = "info@eurotechstudy.com";
        String emailId = "";
        String emailDomain = "";
        System.out.println("Email address = " + email);

        if (email.contains("@")){
            String[] parts = email.split("@");
            if (parts.length == 2){
                emailId = parts[0];
                emailDomain = parts[1];
                System.out.println("Email id : " + emailId);
                System.out.println("Email domain : " + emailDomain);
            }else {
                System.out.println("Invalid email format");
            }
        }else {
            System.out.println("Invalid email format");
        }
    }
}
