import java.util.*;
class LibraryDatabase {
    private List<Book> books;
    private List<User> users;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(){
        System.out.println("Add User");
    }
    public void addBook(){
        System.out.println("Add Book");
    }
    public void updateUser(){
        System.out.println("Update User");
    }
    public void updateBook(){
        System.out.println("Update Book");
    }
    public void deleteUser(){
        System.out.println("Delete User");
    }
    public void deleteBook(){
        System.out.println("Delete Book");
    }
    public void displayUser(){
        System.out.println("Display User");
    }
    public void displayBook(){
        System.out.println("Display Book");
    }
    public void searchUser(){
        System.out.println("Search User");
    }
    public void searchBook(){
        System.out.println("Search Book");
    }

}
