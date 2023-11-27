package DomesticDreamTeam;


public abstract class User {
    protected String name;
    protected String phonenumber;
    protected String email;
    protected String password;
    protected Functions [] functions;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String name, String phonenumber, String email, String password) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.email = email;
        this.password = password;
    }
    abstract public String toString();

    abstract public void menu(Database database, User user);
}
