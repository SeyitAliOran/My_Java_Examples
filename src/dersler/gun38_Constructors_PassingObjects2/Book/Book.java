package dersler.gun38_Constructors_PassingObjects2.Book;

public class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void displayBookDetails(){
        System.out.println("Title : " + title + ", Author : " + author + ", year : " + year);
    }
    public void updateYear(int newYear){
        this.year=newYear;
    }
}
