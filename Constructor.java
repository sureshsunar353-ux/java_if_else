
// bookid
// title
// author

// create a parameterized constructor to initialize these values.
// create a method displayinformation() to display the book details.
// in main(), create two objects using the constructor and display their information.

import java.util.Scanner;
class Exercise{
    int bookId;
    String title;
    String author;


    public Exercise(int bookId, String title, String author){
    this.bookId=bookId;
    this.title=title;
    this.author= author;
}


public void displayinformation(){
    System.out.println("Book id: "+ bookId);
    System.out.println("Title : "+ title);
    System.out.println("Author : "+ author);
}
}



public class Constructor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the bookid: ");
        int bookId =input.nextInt();
        System.out.println("Enter the book title name :");
        String title = input.next();
        System.out.println("Enter the author name: ");
        String author = input.next();
        Exercise obj = new Exercise(bookId, title, author);
        obj.displayinformation();
    }


}
