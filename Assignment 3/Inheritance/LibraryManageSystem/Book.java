class Book {
    private String title;
    private  String author;
    private long isbn;
    private String publication;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public long getIsbn() {
        return isbn;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public String getPublication() {
        return publication;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void showDuet(){
        System.out.println("Show Duet");
    }
    public void reservationStatus(){
        System.out.println("Reservation Status");
    }
    public void feedback(){
        System.out.println("Feedback");
    }
    public void bookRequest(){
        System.out.println("BookRequest");
    }
    public void renewInfo(){
        System.out.println("Renew Info");
    }

}
