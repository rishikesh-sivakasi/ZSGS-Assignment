public class LibraryManagementSystem {
    private String userType;
    private String userName;
    private String password;
    private Librarian librarian;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public void login(){
        System.out.println("Login");
    }
    public void register(){
        System.out.println("Register");
    }
    public void logout(){
        System.out.println("Logout");
    }

    public static void main(String[] args) {

    }
}
