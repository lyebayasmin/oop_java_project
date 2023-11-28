package DomesticDreamTeam;


import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name, String phonenumber, String email, String password) {
        super(name, phonenumber, email, password);
        this.functions = new Functions[]{
                new UpdateProfile(),
                new Hireworker(),
                new PaySalary(),
                new TrackRequest(),
                new CancelService(),
                new ContactTeam(),
                new Exit()
        };
    }
    public String getName() {
        return name;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setName(String name) {
        super.setName(name);
    }
    public void setPhonenumber(String phonenumber) {
        super.setName(phonenumber);
    }
    public void setEmail(String email) {
        super.setName(email);
    }
        public void setPassword(String password) {
            super.setPassword(password);
        }

    @Override
    public void menu(Database database, User user){
        System.out.println("***** Menu *****\n");
        System.out.println("1. Update Profile: \n");
        System.out.println("2. Hire Workers: \n");
        System.out.println("3. Pay Salary: \n");
        System.out.println("4. Track requests: \n");
        System.out.println("5. Cancel Service: \n");
        System.out.println("6. Contact Team: \n");
        System.out.println("7. Exit: \n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        functions[n-1].function(database,user);

    }

    @Override
    public String toString() {
        return "NormalUser{" +
                "name='" + name + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password +
                '}';
    }
}
