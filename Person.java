public class Person {
    private String name;
    private int age;
    private  String emailaddress;
    private String username;

    public Person(String name, int age, String emailaddress, String username) {
        this.name = name;
        this.age = age;
        this.emailaddress = emailaddress;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
