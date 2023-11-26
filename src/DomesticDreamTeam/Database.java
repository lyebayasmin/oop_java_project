package DomesticDreamTeam;
import java.io.*;
import java.util.ArrayList;


public class Database{
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<String> phonenumber = new ArrayList<>();
    private ArrayList<Category> categories = new ArrayList<>();
    private File userfile = new File("G:\\DomesticDreamTeam\\Data\\Usersfile");
    private File workersfile = new File("G:\\DomesticDreamTeam\\Data\\Workersfile");
    private File folder = new File("G:\\DomesticDreamTeam\\Data");

    public Database(){
        if (!folder.exists()){
            folder.mkdirs();
        }
        if (!userfile.exists()){
            try {
                userfile.createNewFile();
                workersfile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        getUser();
    }
    public void addUser(User u){
        users.add(u);
        phonenumber.add(u.getPhonenumber());
        saveUsers();
    }
    public User getuser(User u){
        return u;
    }

    public User login(String phonenumber, String password) {
        for (User u : users) {
            if (u.getPhonenumber().equals(phonenumber) && u.getPassword().equals(password)) {
                System.out.println("Welcome," + u.getName());
                u.menu();
                return u;

            }
        }
        System.out.println("Invalid credentials");
        return null;
    }
    public void getArraylist(){
        for (User u : users){
            System.out.println(u.name);
        }

    }
    public void addWorker(Category category) {
        categories.add(category);


    }
    public void getUser() {
        String text = "";
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(userfile));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br1.readLine()) != null) {
                sb.append(line);
            }
            br1.close();
            text = sb.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (!text.equals("") && !text.isEmpty()) {
            String[] usersData = text.split("<NewUser/>");
            for (String userData : usersData) {
                String[] userDetails = userData.split("<N/>");
                if (userDetails.length >= 4) {
                    String name = userDetails[0];
                    String phoneNumber = userDetails[1];
                    String email = userDetails[2];
                    String userType = userDetails[3];

                    if (userType.equals("Admin")) {
                        User user = new Admin(name, phoneNumber, email, userType);
                        addUser(user);
                    } else {
                        User user = new NormalUser(name, phoneNumber, email, userType);
                        addUser(user);
                    }
                } else {
                    System.out.println("Invalid user data: " + userData);
                }
            }
        }
    }
    public void saveUsers(){
        String text = "";
        for (User u : users){
            text = text + u.toString();
        }
        try {
            PrintWriter pw = new PrintWriter(userfile);
            pw.println(text);
            pw.close();
            System.out.println("Data saved");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void saveWorkers(){
        String text = "";
        for ( Category c : categories){
            text = text + c.toString();
        }
        try {
            PrintWriter pw = new PrintWriter(userfile);
            pw.println(text);
            pw.close();
            System.out.println("Data saved");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }



}
