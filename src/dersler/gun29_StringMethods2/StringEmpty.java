package dersler.gun29_StringMethods2;

public class StringEmpty {
    // bu method verdigimiz STringin icerinde her hangi bir data nin olup olmadigini kontrol eder.
    // boolean dondurur.
    public static void main(String[] args) {
        String userName = " ";
        String password = " ";
        if (userName.trim().isEmpty()) { // bu sekilde bosluklari keser
            System.out.println("UserName bos olamaz");
        }
        if (password.trim().isEmpty()){
            System.out.println("Password bos olamaz");
        }
    }
}
