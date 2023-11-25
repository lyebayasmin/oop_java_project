package oop_java_project;

import java.util.ArrayList;

public class Database {
    ArrayList<User> users = new ArrayList<>();

    public void addUser(User u){
        users.add(u);
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


}
