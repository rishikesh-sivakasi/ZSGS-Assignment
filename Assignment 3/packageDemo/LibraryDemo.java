package packageDemo;

import packageDemo.library.books.Book;
import packageDemo.library.members.Member;
import packageDemo.library.transactions.Transaction;

public class LibraryDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Java Complete Reference", "Herbert Schildt", "12345");

        Member member1 = new Member("rishi", 1);
        Member member2 = new Member("ramesh", 2);

        Transaction transaction1 = new Transaction(book1, member1, "borrow");
        transaction1.processTransaction();

        Transaction transaction2 = new Transaction(book1, member2, "borrow");
        transaction2.processTransaction();

        Transaction transaction3 = new Transaction(book1, member1, "return");
        transaction3.processTransaction();

        Transaction transaction4 = new Transaction(book1, member2, "borrow");
        transaction4.processTransaction();
    }
}
