package GrupCalismalari.Email;

public class Registration {
    /*Task:
Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class. (Every field should be declared as private)

After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username and password. Create at least 2 objects and pass the values.

 Rules:       A. Valid email consider to be only gmail
              B. Valid userName and password cannot be empty and should have at least 6 characters.
              C. Valid password cannot contain userName.
                 (You should print Error Messages )

    Soruda istenen, "Registration" sınıfını oluşturarak, özel (private) olarak tanımlanan "email",
     "userName" ve "password" alanlarını kullanıcıya sağlanan metotlar aracılığıyla ayarlamak ve kontrol etmek.
     Bu alanların belirli kurallara göre atanması gerekmektedir:

 Email, sadece "@gmail.com" ile biten geçerli bir e-posta adresi olmalıdır.
 Kullanıcı adı en az 6 karakter uzunluğunda olmalıdır.
 Parola en az 6 karakter uzunluğunda olmalı ve kullanıcı adını içermemelidir.
 Örnekler oluşturularak bu kurallara uygun veya uymayan girdilerle test yapılmalıdır.
 Doğru girdiler için kullanıcı bilgileri yazdırılmalı, hatalı girdiler için hata mesajları verilmelidir.*/

    private String email;
    private String userName;
    private String password;

    public Registration() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith("@gmail.com")) {
            this.email = email;
        } else System.out.println("Gecersiz e posta adresi girdiniz");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName.length()>=6) {
            this.userName = userName;
        } else System.out.println("Gecersiz kullanici adi ");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()>=6 && !password.contains(userName)) {
            this.password = password;
        }else System.out.println("Gecersiz parola");
    }

    public static void main(String[] args) {
        Registration user1 = new Registration();
        user1.setEmail("alioran05@gmail.com");
        user1.setUserName("user123");
        user1.setPassword("kullanici123");

        Registration user2 = new Registration();
        user2.setEmail("alioran05@hotmail.com");
        user2.setUserName("user");
        user2.setPassword("user");

    }
}
