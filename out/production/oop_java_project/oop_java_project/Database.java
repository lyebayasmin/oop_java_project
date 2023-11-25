package oop_java_project;

import java.util.ArrayList;
import java.util.Iterator;

public class Database {
   ArrayList<User> users = new ArrayList();

   public void addUser(User u) {
      this.users.add(u);
   }

   public User getuser(User u) {
      return u;
   }

   public User login(String phonenumber, String password) {
      Iterator var3 = this.users.iterator();

      User u;
      do {
         if (!var3.hasNext()) {
            System.out.println("Invalid credentials");
            return null;
         }

         u = (User)var3.next();
      } while(!u.getPhonenumber().equals(phonenumber) || !u.getPassword().equals(password));

      System.out.println("Welcome," + u.getName());
      return u;
   }

   public void getArraylist() {
      Iterator var1 = this.users.iterator();

      while(var1.hasNext()) {
         User u = (User)var1.next();
         System.out.println(u.name);
      }

   }
}
