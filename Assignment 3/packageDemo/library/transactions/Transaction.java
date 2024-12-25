package packageDemo.library.transactions;


import packageDemo.library.books.Book;
import packageDemo.library.members.Member;

public class Transaction {
    private Book book;
    private Member member;
    private String transactionType; 

    public Transaction(Book book, Member member, String transactionType) {
        this.book = book;
        this.member = member;
        this.transactionType = transactionType;
    }

    public void processTransaction() {
        if (transactionType.equalsIgnoreCase("borrow")) {
            if (book.isAvailable()) {
                book.setAvailable(false);
                System.out.println(member.getName() + " borrowed " + book.getTitle());
            } else {
                System.out.println(book.getTitle() + " is currently unavailable.");
            }
        } else if (transactionType.equalsIgnoreCase("return")) {
            book.setAvailable(true);
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Invalid transaction type.");
        }
    }
}
