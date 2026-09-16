// Question 2 — Book

// Create a Book class with:

// bookId
// title
// author
// price

// Create overloaded constructors:

// Constructor with only bookId
// Constructor with bookId and title
// Constructor with bookId, title, author, and price

// Create objects using each constructor and display their information.


class Book{
    int bookId;
    String title;
    String author;
    double price;


    Book(int bookId){
        this.bookId = bookId;
    }

    Book(int bookId, String title){
        this.bookId=bookId;
        this.title =title;
    }
    Book(int bookId, String title, String author, double price){
        this.bookId = bookId;
        this.title = title;
        this.author=author;
        this.price=price;
    }

    void dispaly(){
        System.out.println(bookId + " " + title + " " + author + " " + price);
    }
}
public class Copyconstructor1 {
    public static void main(String[] args) {
        
    }
}
