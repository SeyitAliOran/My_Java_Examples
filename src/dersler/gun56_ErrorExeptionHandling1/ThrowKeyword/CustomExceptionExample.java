package dersler.gun56_ErrorExeptionHandling1.ThrowKeyword;

public class CustomExceptionExample {
    public static void main(String[] args) {
        int age = -70;

        // bu sekil de throw ile Exceptioni kendimiz olusturabiiriz.Eger yas 0 dan kucuk ise hata verir ve ekrana yazdirir
        try {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }

            System.out.println("Age entered: " + age);
        }catch (IllegalArgumentException yasException){
            // Bu sekilde hata mesajini kendimiz olusturuyoruz
            System.out.println("Error: " + yasException.getMessage());
        }

    }
}
