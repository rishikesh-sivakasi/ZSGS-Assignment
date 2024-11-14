import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}

class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author, String ISBN, double price) {
        Book newBook = new Book(title, author, ISBN, price);
        books.add(newBook);
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                book.displayBookInfo();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 1000);
        library.addBook("1984", "George Orwell", "9780451524935", 800);
        library.addBook("To Kill a Mockingbird", "Harper Lee", "9780060935467", 700);

        library.displayAllBooks();
    }
}
