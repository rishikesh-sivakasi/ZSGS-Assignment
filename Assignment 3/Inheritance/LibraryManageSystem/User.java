class User {
    private String name;
    private int id;
    private Account account;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void verify(){
        System.out.println("Verify");
    }
    public void checkAccount(){
        System.out.println("CheckAccount");
    }
    public void getBooksInfo(){
        System.out.println("Books Info");
    }

}
