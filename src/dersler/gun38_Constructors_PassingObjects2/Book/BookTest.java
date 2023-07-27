package dersler.gun38_Constructors_PassingObjects2.Book;

public class BookTest {
    // Objectin parametre olarak kullanilmasi
    public static void main(String[] args) {
        Book book1= new Book("Cali kusu","Resat Nuri Guntekin",1935);
        book1.displayBookDetails();
        int newYear = 1922;
        updateBookYear(book1,newYear);
        System.out.println("Updated Details");
        book1.displayBookDetails();
    }
    public static void updateBookYear(Book book,int newYear){ // Objecte parametre gonderdik
        book.updateYear(newYear); // book objecti ile birlikte book classinda da ki metodu cagirdik
    }
}
