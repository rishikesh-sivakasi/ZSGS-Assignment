class Account {
    private int no_borrowed_books;
    private int no_reserved_books;
    private int no_returned_books;
    private int no_lost_books;
    private int fineAmount;

    public int getNo_borrowed_books() {
        return no_borrowed_books;
    }

    public void setNo_borrowed_books(int no_borrowed_books) {
        this.no_borrowed_books = no_borrowed_books;
    }

    public int getNo_reserved_books() {
        return no_reserved_books;
    }

    public void setNo_reserved_books(int no_reserved_books) {
        this.no_reserved_books = no_reserved_books;
    }

    public int getNo_returned_books() {
        return no_returned_books;
    }

    public void setNo_returned_books(int no_returned_books) {
        this.no_returned_books = no_returned_books;
    }

    public int getNo_lost_books() {
        return no_lost_books;
    }

    public void setNo_lost_books(int no_lost_books) {
        this.no_lost_books = no_lost_books;
    }

    public int getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(int fineAmount) {
        this.fineAmount = fineAmount;
    }

    public void calculateFine(){
        System.out.println("Fine Amount");
    }
}
